
package explicacion;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    //Stage es la ventana en general
    //Scene es lo que est[a dentro de la ventana (stage)
    public void start(Stage stage){
        Scene sc = new Scene(getLayout(),500,500);
        stage.setTitle("Carrito de Compras");
        stage.setScene(sc);
        stage.show();
    }
    public HBox getLayout(){
        HBox layout= new HBox();
        Articulo ar = new Articulo("Taladro","Trupper",500.0,5,"img/taladro.jpg");
        layout.getChildren().addAll(ar);
        
        return layout;
    }
    public static void main(String[] args) {
        launch(args);
    }
}
