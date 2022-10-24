package figuras2;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class Main extends Application {

    Pane p;
    RadioButton b1,b2,b3,b4,b5,b6;

    Shape sh;

    @Override
    public void start(Stage stage) {
        Scene sc = new Scene(getLayout(),400,400);
        stage.setScene(sc);
        stage.setTitle("Paint");
        stage.show();
    }

    public VBox getLayout() {
        VBox layout = new VBox();
        HBox hb = new HBox();
        hb.getChildren().addAll(getOpciones(), getDisplay());
        layout.getChildren().addAll(getMenu(), hb);

        return layout;
    }

    public VBox getOpciones() {
        VBox vb = new VBox();
        Image img = new Image("img/circle.png", 30, 30, true, true);
        ImageView circulo = new ImageView(img);
        Image img2 = new Image("img/linea1.png", 30, 30, true, true);
        ImageView linea = new ImageView(img2);
        Image img3 = new Image("img/ellipse.png", 30, 30, true, true);
        ImageView ellipse = new ImageView(img3);
        Image img4 = new Image("img/rectangulo.png", 30, 30, true, true);
        ImageView rectangulo = new ImageView(img4);

        b1 = new RadioButton();
        b1.setGraphic(circulo);
        
        b2 = new RadioButton();
        b2.setGraphic(linea);
        
        b3 = new RadioButton();
        b3.setGraphic(ellipse);
        
        b4 = new RadioButton();
        b4.setGraphic(rectangulo);
        
        b5 = new RadioButton();
        
        ToggleGroup group = new ToggleGroup();
        b1.setToggleGroup(group);
        b2.setToggleGroup(group);
        b3.setToggleGroup(group);
        b4.setToggleGroup(group);
        b5.setToggleGroup(group);
        
        vb.getChildren().addAll(b1, b2, b3,b4,b5);
        return vb;
    }

    public Pane getDisplay() {
        p = new Pane();
        p.setOnMouseMoved(e -> {
            System.out.println("[" + e.getX() + "," + e.getY() + "]");
        });

        p.setOnMousePressed(e -> {
            dibujar(e);
        });
        p.setPrefSize(500, 500);
        return p;
    }

    public void dibujar(MouseEvent e) {
        if (b1.isSelected()){
            sh = new Circle(e.getX(), e.getY(), 20);
            sh.setFill(Color.TRANSPARENT);
            sh.setStroke(Color.BLACK);
        }
        else if(b2.isSelected()) {
            sh = new Line(e.getX(),e.getY(),Math.random()*50,Math.random()*50);
            sh.setFill(Color.TRANSPARENT);
            sh.setStroke(Color.BLACK);
        }
        else if(b3.isSelected()){
             sh = new Ellipse(e.getX(), e.getY(), 20, 30);
            sh.setFill(Color.TRANSPARENT);
            sh.setStroke(Color.BLACK);
        }
        else if(b4.isSelected()){
             sh = new Rectangle(e.getX(), e.getY(),40,20);
            sh.setFill(Color.TRANSPARENT);
            sh.setStroke(Color.BLACK);
        }
//        else if(b5.isSelected()){
//             Label lb = new Label("Hola");
//             p.getChildren().add(lb);
//        }
        
        p.getChildren().addAll(sh);
    }

    public MenuBar getMenu() {
        MenuBar menuB = new MenuBar();

        Menu archivo = new Menu("Archivo");
        Menu ayuda = new Menu("Ayuda");

        MenuItem limpiar = new MenuItem("Limpiar");
        MenuItem salir = new MenuItem("Salir");
        MenuItem acerca = new MenuItem("Acerca...");

        limpiar.setOnAction(e -> limpiar());
        salir.setOnAction(e -> salir());
        acerca.setOnAction(e -> acerca());

        archivo.getItems().addAll(limpiar, salir);
        ayuda.getItems().addAll(acerca);

        menuB.getMenus().addAll(archivo, ayuda);
        return menuB;
    }

    public void limpiar() {
        p.getChildren().clear();

    }

    public void salir() {
        System.exit(0);
    }

    public void acerca() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Acerca...");
        alert.setHeaderText("Java Paint");
        alert.setContentText("Versión: 1.0");
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}