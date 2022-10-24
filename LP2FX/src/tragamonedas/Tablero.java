package tragamonedas;

import javafx.scene.layout.HBox;

public class Tablero extends HBox {

    private Figura f1 = new Figura();
    private Figura f2 = new Figura();
    private Figura f3 = new Figura();

    public Tablero() {
        this.getChildren().addAll(f1,f2,f3);
    }

    public void random() {
        f1.random();
        f2.random();
        f3.random();
    }

//    public void iniciar() {
//        
//    }

    public int getFigura1() {
       int num= f1.getResultado();
       return num;
    }

    public int getFigura2() {
       int num= f2.getResultado();
       return num;
    }

    public int getFigura3() {
       int num= f3.getResultado();
       return num;
    }

}
