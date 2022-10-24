package tragamonedas;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Figura extends ImageView {

    private int x;
    private Image img[];

    public Figura() {
        this.img = new Image[3];
        img[0] = new Image("img/leaf.png", 300, 300, true, true);
        img[1] = new Image("img/lambda.png", 300, 300, true, true);
        img[2] = new Image("img/GCLOGO.png", 300, 300, true, true);
        this.setImage(img[0]);
    }

    public void random() {
        x = (int) (Math.random() * (3));
        this.setImage(img[x]);
    }

    public int getResultado() {
        return x;
    }
}