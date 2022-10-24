
package interfaces;

public class DemoInterfaces {
    public static void main(String[] args) {
        Robot rb = new Robot();
        Auto1 a = new Auto1();
        rb.on();
        a.on();
        IPrender ip = new Auto1();
        ip.on();
        ip=rb;
        ip.on();
        Robot rb1 = (Robot)ip;
        rb1.caminar();
    }
}

 class Robot implements IPrender, IOpciones, IOperar{ //Puede implementar más de una

    @Override
    public void on() {
        System.out.println("Robot ON");
    }

    @Override
    public void off() {
        System.out.println("Robot OFF");
    }

    @Override
    public void cambiarNombre() {
        System.out.println("Cambia el nombre");  
    }

    @Override
    public void caminar() {
        System.out.println("Caminando");
    }
  
        
    }
  class Auto1 implements IPrender{

        @Override
        public void on() {
            System.out.println("Prendiendo el carro...");
        }

        @Override
        public void off() {
            System.out.println("Apagando el Carro");
        }
}
interface IPrender{
    void on();
    void off();
}
interface IOpciones{
    void cambiarNombre();
    }
interface IOperar{
    void caminar();
}
