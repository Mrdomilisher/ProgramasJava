package shape;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class figuras extends Application {

    private Pane vb;
    private Shape shape;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioButton rb4;

    @Override
    public void start(Stage stage) {
        Scene sc = new Scene(getLayout(), 300, 300);
        stage.setScene(sc);
        stage.show();
    }

    public BorderPane getLayout() {
        BorderPane layout = new BorderPane();
        MenuBar mb = new MenuBar();
        Menu archivo = new Menu("Archivo");
        
        MenuItem mi1 = new MenuItem("Limpiar");
          MenuItem mi2 = new MenuItem("Salir");
          mi1.setOnAction(e->{limpiar();});
         mi2.setOnAction(e->{salir();});

      archivo.getItems().addAll(mi1,mi2);
        mb.getMenus().add(archivo);
        vb = new Pane();
        layout.setCenter(vb);
        vb.setOnMouseMoved(e -> {
            System.out.println("[" + e.getX() + "," + e.getY() + "]");
        });
        vb.setOnMouseClicked(e -> {
            dibujar(e);
        });
        vb.setOnMousePressed(e -> {
            System.out.println("presionado");
        });
        vb.setOnMouseReleased(e -> {
            System.out.println("Soltando");
        });
        layout.setTop(mb);
        layout.setLeft(Botones());
        return layout;

    }

    public VBox Botones() {
        VBox vb2 = new VBox();
        Button b1 = new Button();
        ToggleGroup group = new ToggleGroup();


        rb1 = new RadioButton("Circulo");
        rb1.setToggleGroup(group);
        rb2 = new RadioButton("Rectangulo");
        rb2.setToggleGroup(group);
       

        rb3 = new RadioButton("Ellipse");
        rb3.setToggleGroup(group);
       

        rb4 = new RadioButton("Linea");
        rb4.setToggleGroup(group);
         
         b1 = new Button("Text");

        vb2.getChildren().addAll(rb1, rb2, rb3, rb4);
      
        

        return vb2;
    
  }public void limpiar(){
      vb.getChildren().clear();
 }public void salir(){
      System.exit(0);
  }
    public void dibujar(MouseEvent e) {

        if (rb1.isSelected()== true) {
            shape = new Circle(e.getX(), e.getY(), 20);
            shape.setFill(Color.TRANSPARENT);
            shape.setStroke(Color.BLACK);
            vb.getChildren().add(shape);

        } else if (rb2.isSelected()== true) {
          shape = new Rectangle(e.getX(), e.getY(),10,30);
            shape.setFill(Color.TRANSPARENT);
            shape.setStroke(Color.BLACK);
            vb.getChildren().add(shape);
        } else if (rb3.isSelected()== true) {
            shape = new Ellipse(e.getX(), e.getY(),30,30);
            shape.setFill(Color.TRANSPARENT);
            shape.setStroke(Color.BLACK);
            vb.getChildren().add(shape);    

        } else if (rb4.isSelected()== true) {
            shape = new Line(e.getX(),e.getY(),20,10);
            shape.setStroke(Color.BLACK);
            vb.getChildren().add(shape);;
        }

    }

    public static void main(String[] args) {
        launch(args);

    }
}