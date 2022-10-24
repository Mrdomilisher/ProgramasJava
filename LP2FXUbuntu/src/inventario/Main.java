package inventario;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private TextField tf1,tf2,tf3,tf4,tf5;
    private VBox vb2;

    @Override
    public void start(Stage stage) {
        Scene sc = new Scene(getLayout(), 500, 500);
        stage.setTitle("Carrito de Compras");
        stage.setScene(sc);
        stage.show();
    }

    public HBox getLayout() {
        HBox layout = new HBox();
        VBox vb = new VBox();
        tf1 = new TextField();
        tf2 = new TextField();
        tf3 = new TextField();
        tf4 = new TextField();
        tf5 = new TextField();
        Label lb1 = new Label("Descripcion:");
        Label lb2 = new Label("Marca:");
        Label lb3 = new Label("Precio:");
        Label lb4 = new Label("Inventario:");
        Label lb5 = new Label("Imagen:");
        HBox botones = new HBox();
        Button b1 = new Button("Agregar");
        Button b2 = new Button("Limpiar");
        b1.setOnAction(e -> agregar());
        b2.setOnAction(e -> limpiar());
        botones.getChildren().addAll(b1, b2);
        vb.getChildren().addAll(lb1, tf1, lb2, tf2, lb3, tf3, lb4, tf4, lb5, tf5, botones);
         vb2 = new VBox();
        layout.getChildren().addAll(vb, vb2);
        return layout;
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void agregar() {
        double precio = Double.parseDouble(tf3.getText());
        int inventario = Integer.parseInt(tf4.getText());
        Articulo a = new Articulo(tf1.getText(), tf2.getText(), precio, inventario, tf5.getText());
        vb2.getChildren().add(a);
        
    }

    public void limpiar() {
        tf1.setText("");
        tf2.setText("");
        tf3.setText("");
        tf4.setText("");
        tf5.setText("");
    }
}
