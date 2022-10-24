
package parcial2;

public class Main {
    public static void main(String[] args) {
        
        Superheroe sp = new Superheroe();
        Auto a = new Auto();
        System.out.println("AutoMovil: ");
        empezarAMoverse(a);
        System.out.println("\nSuperHeroe: ");
        empezarAMoverse(sp);
        
        
    }
    public static void empezarAMoverse(VehiculoMovil vehiculomovil){
        if (vehiculomovil instanceof Superheroe) {
            Superheroe sp =(Superheroe)vehiculomovil;
            sp.volar();
            sp.desplazar();
            sp.subirVelocidad();
            sp.detenerse();
            
        }
        else if (vehiculomovil instanceof Auto) {
            Auto a =(Auto)vehiculomovil;
            a.desplazar();
            a.subirVelocidad();
            a.cambiarMarcha();
            a.detenerse();
        }  
        
    }
}
