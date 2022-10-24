package parcial2;

public class NewClass {
    public static void main(String[] args) {
        superhero a = new Superman();
        superhero b = new Batman();
        superhero c = new Spiderman();
        superhero d = new Xman();
        superhero e = new Ironman();
        superhero[] heroes = {new Superman(), new Batman(), new Spiderman(), new Xman(), new Ironman()};
        for (superhero s : heroes) {
            s.Superpoder();
        }
    }
}


abstract class superhero{
    abstract void Superpoder();
}

class luchador extends superhero{

    @Override
    void Superpoder() {
        System.out.println("Fuerza");
    }
    
}

class tactico extends superhero{

    @Override
    void Superpoder() {
        System.out.println("Agilidad");
    }
    
}

class Superman extends luchador{
    @Override
    void Superpoder() {
        System.out.println("Volar");
    }    
}
class Batman extends luchador{
    @Override
    void Superpoder() {
        System.out.println("Inteligencia");
    }   
}
class Spiderman extends luchador{

    @Override
    void Superpoder() {
        System.out.println("escalar");
    }
}

class Xman extends tactico{
    @Override
    void Superpoder() {
        System.out.println("Pensar");
    }
}

class Ironman extends tactico{
    @Override
    void Superpoder() {
        System.out.println("Agilidad mental");
    }
}