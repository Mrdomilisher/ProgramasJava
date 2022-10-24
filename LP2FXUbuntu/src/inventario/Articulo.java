package inventario;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Articulo extends HBox {

    private String descripcion;
    private String marca;
    private double precio;
    private int inventario;
    private String imagen;
    private Label lb1 = new Label("");
    private Label lb2 = new Label("");
    private Label lb3 = new Label("");
    private Label lb4 = new Label("");
    private ImageView imgv = new ImageView();

    public Articulo(String descripcion, String marca, double precio, int inventario, String imagen) {
        setDescripcion(descripcion);
        setMarca(marca);
        setPrecio(precio);
        setInventario(inventario);
        setImagen(imagen);
        VBox vb = new VBox(lb1, lb2, lb3, lb4);
        vb.setSpacing(5);
        vb.setPadding(new Insets(10));
        this.getChildren().addAll(imgv, vb);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        this.lb1.setText("Descripción: " + this.descripcion);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
        lb2.setText("Marca: " + this.marca);

    }

    public double getPrecio() {

        return precio;
    }

    public void setPrecio(double precio) {
        if (precio <= 0) {
            throw new IllegalArgumentException("Valor incorrecto");

        } else {
            this.precio = precio;
            this.lb3.setText("Precio: " + this.precio);

        }
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
        this.lb4.setText("Inventario: " + this.inventario);

    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
        imgv.setImage(new Image(this.imagen, 100, 100, true, true));

    }

}
