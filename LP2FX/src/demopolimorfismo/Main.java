package demopolimorfismo;

public class Main {

    public static void main(String[] args) {
        Figura f;
        Triangulo t = new Triangulo();
        Circulo c = new Circulo();
        Cuadrado cu = new Cuadrado();
        Figura[] figuras = {new Cuadrado(), new Triangulo(), new Circulo()};

//Primer metodo        
        dibujarFigura(c);
        dibujarFigura(t);

//Segundo metodo
        f = t;
        f.dibujar();
        f = c;
        f.dibujar();
//Tercer metodo

//Recorre todo el arreglo con los ":" For para recorrer un arreglo
        for (Figura figura : figuras) {
            figura.dibujar();
        }
    }

    public static void dibujarFigura(Figura f) {
        f.dibujar();
    }
}

abstract class Figura {

    public abstract void dibujar();

}

class Triangulo extends Figura {

    @Override
    public void dibujar() {
        System.out.println("▲");
    }

}

class Circulo extends Figura {

    @Override
    public void dibujar() {
        System.out.println("●");
    }

}

class Cuadrado extends Figura {

    @Override
    public void dibujar() {
        System.out.println("■");
    }

}
