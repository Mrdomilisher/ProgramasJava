
package dados;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{
        private Dado d1, d2;

    @Override
    public void start(Stage stage)   {
          Scene sc = new Scene(getLayout(), 400, 400);
        stage.setTitle("Dados");
        stage.setScene(sc);
        stage.show();
    }
    
    public VBox getLayout(){
        VBox layout = new VBox();
        HBox hb = new HBox();
        Button b1 = new Button("Roll the dice!");
         d1 = new Dado();
         d2 = new Dado();
        b1.setOnAction(e->tirarDado());
       hb.getChildren().addAll(d1,d2);
       layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(hb,b1);
        return layout;
    }
    
    public void tirarDado(){
        d1.lanzar();
        d2.lanzar();
        System.out.println(d1.getNumero()+d2.getNumero());  
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
    