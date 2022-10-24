package dados;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Dado extends ImageView {

    private Image[] lista;
    private int numero;

    public Dado() {
        this.lista = new Image[6];
        lista[0] = new Image("img/1.jpg", 200, 200, true, true);
        lista[1] = new Image("img/2.jpg", 200, 200, true, true);
        lista[2] = new Image("img/3.jpg", 200, 200, true, true);
        lista[3] = new Image("img/4.jpg", 200, 200, true, true);
        lista[4] = new Image("img/5.jpg", 200, 200, true, true);
        lista[5] = new Image("img/6.jpg", 200, 200, true, true);
        this.setImage(lista[0]);
    }

    public void lanzar() {
        numero = (int) (Math.random() * (6));
        this.setImage(lista[numero]);
        
    }

    public int getNumero() {
        return numero+1;
    }

}
