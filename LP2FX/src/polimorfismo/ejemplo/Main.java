package polimorfismo.ejemplo;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Control;
import javafx.scene.control.Labeled;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private VBox layout;

    @Override
    public void start(Stage stage) {
        Control lista[]= {new Button(), new CheckBox(), new TextField()};
        Scene sc = new Scene(getLayout(), 300, 300);
        stage.setScene(sc);
        stage.setTitle("Polimorfismo");
        stage.show();
    }

    public VBox getLayout() {
        layout = new VBox();
        layout.getChildren().addAll(new Button("Hola"));
        layout.getChildren().addAll(new CheckBox("Soltero"));
        layout.getChildren().addAll(new RadioButton("Soltero"));
        Button b1 = new Button("Modificar");
        layout.getChildren().addAll(b1);

        b1.setOnAction(e -> modificar());
        return layout;
    }

    public void modificar() {
        for (Node node : layout.getChildren()) {
            Labeled lb = (Labeled)node;
            lb.setText("Chihuahua");
        }
    }

    
    public static void main(String[] args) {
        launch(args);
    }
}
