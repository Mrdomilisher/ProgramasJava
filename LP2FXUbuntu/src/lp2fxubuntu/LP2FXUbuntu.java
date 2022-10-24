
package lp2fxubuntu;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author domi
 */
public class LP2FXUbuntu extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
    public void start(Stage stage) {
        Scene sc = new Scene(getLayout(),300,300);
        stage.setScene(sc);
        stage.show();
    }
    public VBox getLayout(){
        VBox vb = new VBox();
        return vb;
    }
}
