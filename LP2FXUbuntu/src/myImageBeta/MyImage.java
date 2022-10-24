package myImageBeta;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class MyImage extends VBox {

    private Label lbTitulo;
    private ImageView imgv;
    private Label lbDescripcion;

    public MyImage(String lbTitulo, Image imgv, String lbDescripcion) {
        setLbTitulo(lbTitulo);
        setImgv(imgv);
        setLbDescripcion(lbDescripcion);
        
        
    }   
    
//    public String getLbDescripcion() {
//        return ;
//        
//    }
//     public Image getImage() {
//         
//    }
//       public Label getLbTitulo() {
//        return lbTitulo;
//    }

    public void setLbDescripcion(String lbDescripcion) {
        this.lbDescripcion =new Label(lbDescripcion);
    }
    public void setImgv(Image imgv) {
        this.imgv=new ImageView(imgv);
    }
    public void setLbTitulo(String lbTitulo) {
        this.lbTitulo=new Label(lbTitulo);
    }
    
    @Override
    public String toString() {
        return "MyImage{" + "lbTitulo=" + lbTitulo + ", imgv=" + imgv + ", lbDescripcion=" + lbDescripcion + '}';
    }


    
}
