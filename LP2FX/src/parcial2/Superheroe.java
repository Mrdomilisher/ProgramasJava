
package parcial2;

public class Superheroe extends VehiculoMovil{

    @Override
    public void desplazar() {
        System.out.println("El SuperHeroe se está desplazando");
    }

    @Override
    public void subirVelocidad() {
        System.out.println("El SuperHeroe sube de velocidad");
    }

    @Override
    public void detenerse() {
        System.out.println("El SuperHeroe se detiene");
    }
    public void volar(){
        System.out.println("El SuperHeroe vuela");
    }
    
}
