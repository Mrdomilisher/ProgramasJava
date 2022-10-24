package ejemplo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main2 extends Application {

    @Override
    public void start(Stage stage) {
        Scene sc = new Scene(getLayout(), 300, 200);
        stage.setTitle("Información");
        stage.setScene(sc);
        stage.show();
    }

    public BorderPane getLayout() {

        //Crear el MenuBar
        MenuBar menuBar = new MenuBar();

        //Crear los menus
        Menu archivoMenu = new Menu("Archivo");
        Menu ayudaMenu = new Menu("Ayuda");

        // Crear los submenus
        MenuItem informacionItem = new MenuItem("Información");
        MenuItem galeriaItem = new MenuItem("Galeria");
        MenuItem salirItem = new MenuItem("Salir");
        MenuItem acercaItem = new MenuItem("Acerca...");

        //Crear las acciones al picarle
        salirItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });
        galeriaItem.setOnAction(e -> {
            galeria();
        });
        informacionItem.setOnAction(e -> {
            informacion();
        });
        acercaItem.setOnAction(e -> {
            alerta();
        });

        // Agregar los submenus a los menus
        archivoMenu.getItems().addAll(informacionItem, galeriaItem, salirItem);
        ayudaMenu.getItems().addAll(acercaItem);

        // Agregar menus al MenuBar
        menuBar.getMenus().addAll(archivoMenu, ayudaMenu);

        BorderPane layout = new BorderPane();
        layout.setTop(menuBar);
        return layout;
    }

    public void galeria() {
        Galeria g1 = new Galeria("Galeria");
        g1.show();
    }

    public void informacion() {
        Main m1 = new Main("Información");
        m1.show();
    }

    public void alerta() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Más información");
        alert.setHeaderText("Versión:");
        alert.setContentText("1.0");

        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }                                                           
}
