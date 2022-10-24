
package empleado;

public class EmpleadoSueldo extends Empleado{

        private double sueldoSemanal;
    
    public EmpleadoSueldo(String nombre) {
        super(nombre);
    }

    public EmpleadoSueldo() {
        this(1543.50,"Juan");
    }
    public EmpleadoSueldo(double sueldoSemanal, String nombre) {
        super(nombre);
        this.sueldoSemanal = sueldoSemanal;
    } 
    

    @Override
    public double getSueldo() {
        return this.sueldoSemanal;  
    }

    @Override
    public String toString() {
        return "EmpleadoSueldo{" + "sueldoSemanal=" + sueldoSemanal +  " "+super.toString()+'}';
    }
    
}
