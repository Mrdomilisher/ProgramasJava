
package interfaces.controlremoto;


public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Luz luz = new Luz();
        Cortinas cortinas = new Cortinas();
        ControlRemoto.on(tv);
        ControlRemoto.on(luz);
        ControlRemoto.off(cortinas);
        ControlRemoto.on(tv);
        System.out.println(tv);
        
    }
    
}
