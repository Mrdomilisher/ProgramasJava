package explicacion;

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
    private ImageView imgv = new ImageView();
    
    public Articulo(String descripcion, String marca, double precio, int inventario, String imagen){
        setDescripcion(descripcion);
        setMarca(marca);
        setPrecio(precio);
        setInventario(inventario);
        setImagen(imagen);
        
        VBox vb = new VBox();
        Label lb1 = new Label("Descripcion: "+descripcion);
        Label lb2 = new Label("Marca: "+marca);
        Label lb3 = new Label("Precio: "+precio);
        Label lb4 = new Label("Inventario: "+inventario);
        vb.getChildren().addAll(lb1,lb2,lb3,lb4);
        this.getChildren().addAll(imgv,vb);
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
        imgv.setImage(new Image(this.imagen,100,100,true,true));
        
    }


    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        if (inventario < 0) {
            throw new IllegalArgumentException("Inventario no puede ser negativo");
        } else {
            this.inventario = inventario;

        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo o cero");
        } else {
            this.precio = precio;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
