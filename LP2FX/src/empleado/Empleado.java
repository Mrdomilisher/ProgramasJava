
package empleado;


public abstract class Empleado {
    
    private String nombre;

    public Empleado(String nombre) {
        setNombre(nombre);
    }

    
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public abstract double getSueldo();

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + '}';
    }
    
    
}
