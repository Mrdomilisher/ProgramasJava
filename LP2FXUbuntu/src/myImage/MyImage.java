package myImage;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class MyImage extends VBox {

    private Label lbTitulo;
    private ImageView imgv;
    private Label lbDescripcion;

    public MyImage(String lbTitulo, Image imgv, String lbDescripcion) {
       this.lbTitulo= new Label(lbTitulo);
       this.lbDescripcion= new Label(lbDescripcion);
       this.imgv=new ImageView(imgv);
        this.getChildren().addAll(this.lbTitulo,this.imgv,this.lbDescripcion);
        
    }   
    
    public String getTitulo(){
    return lbTitulo.getText();
}
    
    public void setTitulo(String lbTitulo){
        this.lbTitulo.setText(lbTitulo);
    }
    public void setDescripcion(String lbDescripcion){
        this.lbDescripcion.setText(lbDescripcion);
        
    }
    
    @Override
    public String toString() {
        return "MyImage{" + "lbTitulo=" + lbTitulo + ", imgv=" + imgv + ", lbDescripcion=" + lbDescripcion + '}';
    }


    
}
