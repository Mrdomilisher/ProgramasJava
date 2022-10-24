
package ventanas;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


class Ventana1 extends Stage{

    public Ventana1() {
        this("Ventanita sin Titulo");
    }
    
    public Ventana1(String titulo) {
        super();
        this.setTitle(titulo);
        Scene sc = new Scene(getLayout(),200,300);
        setScene(sc);
        
    }

    public HBox getLayout() {
        HBox layout = new HBox();
        Label lb1 = new Label("Hola");
        layout.getChildren().add(lb1);
        return layout;
    }
    
    
    
    
    

    
    
}
