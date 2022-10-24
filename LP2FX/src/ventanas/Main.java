
package ventanas;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    public void start(Stage stage)  {
        Scene sc = new Scene(getLayout(),300,200);
        stage.setTitle("Ventanas");
        stage.setScene(sc);
        stage.show();
    }
    
    public VBox getLayout(){
        VBox layout = new VBox();
        Button b1 = new Button("Abrir ventana");
        b1.setOnAction(e->{ventana1();});
        layout.getChildren().add(b1);
        return layout;
    }
    public static void main(String[] args) {
        launch(args );
    }

    public void ventana1() { //Crear un objeto en el mismo paquete
        Ventana1 v1 = new Ventana1("ULSA Chihuahua");
        v1.show();
    }
    
    
}
