package myImageBeta;

import java.util.Optional;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private ImageView imgv, imgv2;
    private Label lb1, lb2, lb3, lb4;
    private MyImage mi, mi2;

    @Override
    public void start(Stage stage) {
        Scene sc = new Scene(getLayout(), 400, 400);
        stage.setTitle("Información");
        stage.setScene(sc);
        stage.show();
    }

    public VBox getLayout() {
        VBox layout = new VBox();
         layout.setSpacing(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(getInfo(), getBotones(), getBotones2());

        return layout;
    }

    public HBox getInfo() {
        HBox layout = new HBox();
          layout.setSpacing(10);
        layout.setPadding(new Insets(20));
        Image img = new Image("img/GCLOGO.png", 100, 100, true, true);
        Image img2 = new Image("img/GCLOGO.png", 100, 100, true, true);
        lb1 = new Label("Pedro");
        lb2 = new Label("Ana");
        lb3 = new Label("Pedro es un ingeniero bla bla bla");
        lb4 = new Label("Ana es una cientifica bla bla bla");
        imgv = new ImageView(img);
        imgv2 = new ImageView(img2);

        VBox vb = new VBox();
        VBox vb2 = new VBox();
        vb.getChildren().addAll(lb1, imgv, lb3);
        vb2.getChildren().addAll(lb2, imgv2, lb4);
        layout.getChildren().addAll(vb, vb2);
        return layout;
    }

    public HBox getBotones() {
        HBox layout = new HBox();
          layout.setSpacing(10);
        Button b1 = new Button("Cambiar nombre 1");
        Button b2 = new Button("Cambiar descripcion 1");
        b1.setOnAction(e -> cambiarNombre()); //1
        b2.setOnAction(e -> cambiarDescripcion());//2
        layout.getChildren().addAll(b1, b2);
        return layout;
    }
    
      public void cambiarNombre() {
        TextInputDialog dialog = new TextInputDialog("Pedro");//1
        dialog.setTitle("Cambiar nombre");
        dialog.setHeaderText("Cambiar nombre");
        dialog.setContentText("Nombre a cambiar");
        Optional<String> result = dialog.showAndWait();

        lb1.setText(dialog.getResult());

    }
        public void cambiarDescripcion(){
         TextInputDialog dialog = new TextInputDialog("Pedro es un ingeniero bla bla bla");//2
        dialog.setTitle("Cambiar descripcion");
        dialog.setHeaderText("Cambiar descripcion");
        dialog.setContentText("Descripcion a cambiar");
        Optional<String> result = dialog.showAndWait();

        lb3.setText(dialog.getResult());
    }

    public HBox getBotones2() {
        HBox layout = new HBox(); 
        layout.setSpacing(10);
        Button b1 = new Button("Cambiar nombre 2");
        Button b2 = new Button("Cambiar descripcion 2");
        b1.setOnAction(e -> cambiarDescripcion2());
        b2.setOnAction(e -> cambiarNombre2());
        layout.getChildren().addAll(b1, b2);
        return layout;
    }

  

    public void cambiarNombre2() {
        TextInputDialog dialog = new TextInputDialog("Ana es una cientifica bla bla bla");
        dialog.setTitle("Cambiar nombre");
        dialog.setHeaderText("Cambiar nombre");
        dialog.setContentText("Nombre a cambiar");
        Optional<String> result = dialog.showAndWait();

        lb4.setText(dialog.getResult());

    }
  
    
    public void cambiarDescripcion2(){
         TextInputDialog dialog = new TextInputDialog("Ana");
        dialog.setTitle("Cambiar descripcion");
        dialog.setHeaderText("Cambiar descripcion");
        dialog.setContentText("Descripcion a cambiar");
        Optional<String> result = dialog.showAndWait();

        lb2.setText(dialog.getResult());
    }

    public static void main(String[] args) {
        launch(args);
    }

}
