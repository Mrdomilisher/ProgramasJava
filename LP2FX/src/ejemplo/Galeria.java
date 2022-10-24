package ejemplo;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Galeria extends Stage {
    
    public Galeria () {
        this("Ventanita sin Titulo");
    }
    
    public Galeria (String titulo) {
        super();
        this.setTitle(titulo);
        Scene sc = new Scene(getLayout(),400,300);
        setScene(sc);
        
    }

    public VBox getLayout() {
        VBox layout = new VBox();
        layout.getChildren().addAll(getTitulo(), getImages(), getButtons());
        return layout;
    }

    public StackPane getTitulo() {
        StackPane layout = new StackPane();
        Font f = new Font("Comic Sans MS", 30);
        Label lb1 = new Label("GALERIA DE IMAGENES");
        lb1.setTextFill(Color.web("Green"));
        lb1.setFont(f);
        layout.getChildren().add(lb1);
        return layout;
    }

    public GridPane getImages() {
        GridPane layout = new GridPane();
        layout.setHgap(20);
        layout.setVgap(20);
        layout.setPadding(new Insets(20));
        Image img = new Image("img/user.jpg", 100, 100, true, true);
        Image img2 = new Image("img/user.jpg", 100, 100, true, true);
        Image img3 = new Image("img/user.jpg", 100, 100, true, true);

        ImageView imgv = new ImageView(img);
        ImageView imgv2 = new ImageView(img2);
        ImageView imgv3 = new ImageView(img3);
        
        Label lb = new Label("Juan");
        Label lb2 = new Label("Toño");
        Label lb3 = new Label("Pedro");
        
         Font f = new Font("Comic Sans MS", 15);
        lb.setTextFill(Color.web("Red"));
        lb.setFont(f);
        
         Font f2 = new Font("Comic Sans MS", 15);
        lb2.setTextFill(Color.web("Red"));
        lb2.setFont(f2);
        
         Font f3 = new Font("Comic Sans MS", 15);
        lb3.setTextFill(Color.web("Red"));
        lb3.setFont(f3);
        
        layout.add(imgv, 0, 1);
        layout.add(lb, 0, 0);
        layout.add(imgv2, 1, 1);
        layout.add(lb2, 1, 0);
        layout.add(imgv3, 2, 1);
        layout.add(lb3, 2, 0);
        return layout;

    }

    public HBox getButtons() {
        HBox layout = new HBox();
        Button b1 = new Button("Ok");
        Button b2 = new Button("Cancel");
        layout.getChildren().addAll(b1, b2);
        layout.setAlignment(Pos.CENTER);
        return layout;
    }

}
