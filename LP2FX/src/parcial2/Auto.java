package parcial2;

public class Auto extends VehiculoMovil {

    @Override
    public void desplazar() {
        System.out.println("El Auto se está desplazando");

    }

   @Override
    public void subirVelocidad() {
        System.out.println("El Auto sube de velocidad");
    }

    @Override
    public void detenerse() {
        System.out.println("El Auto se detiene");
    }
    public void cambiarMarcha(){
        System.out.println("El auto cambia de marcha");
    }

}
