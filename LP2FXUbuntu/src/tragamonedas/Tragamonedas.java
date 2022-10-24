 package tragamonedas;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Tragamonedas extends Application {

    private Tablero tb1 = new Tablero();

    @Override
    public void start(Stage stage) {
        Scene sc = new Scene(getLayout(), 900, 500);
        stage.setTitle("Las Vegas");
        stage.setScene(sc);
        stage.show();
    }

    public VBox getLayout() {
        VBox layout = new VBox();
        Button b1 = new Button("¡Girar!");
        Label lb1 = new Label("¡Tragamonedas!");
        Font f = new Font("Comic Sans",60);
        lb1.setFont(f);
        lb1.setTextFill(Color.web("#0076a3"));
        b1.setOnAction(e -> showResultado());
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(lb1,tb1, b1);

        return layout;
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void showResultado() {
        tb1.random();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        if (tb1.getFigura1() == tb1.getFigura2()
                && tb1.getFigura1() == tb1.getFigura3()
                && tb1.getFigura2() == tb1.getFigura3()) {
            alert.setTitle("Ganancia");
            alert.setHeaderText("¡Ganaste!");
            alert.setContentText("$5");
        } else if (tb1.getFigura1() == tb1.getFigura2()
                || tb1.getFigura1() == tb1.getFigura3()
                || tb1.getFigura2() == tb1.getFigura3()) {
            alert.setTitle("Ganancia");
            alert.setHeaderText("¡Ganaste!");
            alert.setContentText("$3");
        } else {
            alert.setTitle("Ganancia");
            alert.setHeaderText("Lo sentimos... No ganaste");
            alert.setContentText("$0");
        }
        alert.showAndWait();
    }
}