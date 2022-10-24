package figuras;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class Main extends Application {

    VBox vb = new VBox();
    Shape sh;

    @Override
    public void start(Stage stage) {
        Scene sc = new Scene(getLayout(), 300, 300);
        stage.setScene(sc);
        stage.setTitle("Paint");
        stage.show();
    }

    public HBox getLayout() {
        HBox layout = new HBox();
        VBox vb2 = new VBox();

        ToggleGroup group = new ToggleGroup();

        RadioButton b1 = new RadioButton("Rectangle");
        b1.setOnAction(e -> {
            sh = new Rectangle(10, 20);
        });
        RadioButton b2 = new RadioButton("Circle");
        b2.setOnAction(e -> {
            sh = new Circle(10);
        });

        RadioButton b3 = new RadioButton("Elipse");
        b3.setOnAction(e -> {
            sh = new Ellipse(10, 20);
        });

        Button b4 = new Button("Dibujar");
        b4.setOnAction(e -> dibujar());
        b1.setToggleGroup(group);
        b2.setToggleGroup(group);
        b3.setToggleGroup(group);
        vb2.getChildren().addAll(b1, b2, b3, b4);
               vb.setPrefSize(200, 200);

        layout.getChildren().addAll(vb, vb2);
        return layout;
    }

    public void dibujar() {
        

        vb.getChildren().addAll(sh);

    }

    public static void main(String[] args) {
        launch(args);
    }

}
