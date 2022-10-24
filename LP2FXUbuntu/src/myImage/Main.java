package myImage;

import java.util.Optional;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {


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
        Image img = new Image("img/user.jpg",200,200,true,true);
        Image img2 = new Image("img/user.jpg",200,200,true,true);
        mi=new MyImage("Juan",img,"Juan es un arqui");
        mi2=new MyImage("Pedro",img2,"Pedro es un ing.");
          Button b1 = new Button("Cambiar nombre 1");
        Button b2 = new Button("Cambiar descripcion 1");
        Button b3 = new Button("Salir");
        b1.setOnAction(e -> cambiarNombre()); 
        b2.setOnAction(e -> cambiarDescripcion());
        b3.setOnAction((new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        }));
        HBox hb = new HBox(mi,mi2);
        HBox hb2 = new HBox(b1,b2,b3);
        layout.getChildren().addAll(hb,hb2);
        
        return layout;
    }
        public void cambiarNombre() {
        TextInputDialog dialog = new TextInputDialog("");
        dialog.setTitle("Cambiar nombre");
        dialog.setHeaderText("Cambiar nombre");
        dialog.setContentText("Nombre a cambiar");
        Optional<String> result = dialog.showAndWait();
        mi.setTitulo(dialog.getResult());


    }
        public void cambiarDescripcion(){
         TextInputDialog dialog = new TextInputDialog("");
        dialog.setTitle("Cambiar descripcion");
        dialog.setHeaderText("Cambiar descripcion");
        dialog.setContentText("Descripcion a cambiar");
        Optional<String> result = dialog.showAndWait();
        mi.setDescripcion(dialog.getResult());
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }

}
