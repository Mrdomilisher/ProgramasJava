package ejemplo;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Stage {

    public Main() {
        this("Ventanita sin Titulo");
    }

    public Main(String titulo) {
        super();
        this.setTitle(titulo);
        Scene sc = new Scene(getLayout(), 400, 300);
        setScene(sc);

    }

    public BorderPane getLayout() {
        BorderPane layout = new BorderPane();
        layout.setPadding(new Insets(20));

        layout.setBottom(getBotones());
        layout.setCenter(getUsuario());

        return layout;
    }

    public HBox getUsuario() {
        HBox layout = new HBox();
        layout.setPadding(new Insets(20));

        Image img = new Image("img/GCLOGO.png", 100, 100, true, true);
        ImageView imgv = new ImageView(img);
        layout.getChildren().addAll(imgv, getDatos());
        return layout;
    }

    public VBox getDatos() {
        VBox layout = new VBox();
        layout.setPadding(new Insets(20));

        layout.getChildren().add(new Label("Nombre: GameCube"));
        layout.getChildren().add(new Label("Direccion: Calle #27"));
        layout.getChildren().add(new Label("Telefono: 666 666 666"));
        return layout;

    }

    public HBox getBotones() {
        HBox layout = new HBox();
        layout.setPadding(new Insets(20));

        Button b1 = new Button("Ok");
        layout.getChildren().add(b1);
        layout.getChildren().add(new Button("Cancel"));

        return layout;
    }

   

}
