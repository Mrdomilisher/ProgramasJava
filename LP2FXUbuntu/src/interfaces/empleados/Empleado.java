package interfaces.empleados;

import java.util.Comparator;

public class Empleado {

    String nombre;
    double sueldo;
    int edad;

    //comparable es para ordenar por cualquiera de sus atributos
    //
    
    public Empleado(String nombre, double sueldo, int edad) {
        setNombre(nombre);
        setSueldo(sueldo);
        setEdad(edad);
    }
    public Empleado() {
        this.edad=27;
        this.nombre="Pedro";
        this.sueldo=6000;
    }

    
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;

        } else {
            throw new IllegalArgumentException("Error");
        }
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        if (sueldo>0) {
                    this.sueldo = sueldo;

        }
        else{
            throw new IllegalArgumentException("Error");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", sueldo=" + sueldo + ", edad=" + edad + '}';
    }
    
}
  class sortEdad implements Comparator<Empleado>{

        @Override
        public int compare(Empleado t, Empleado t1) {
            return t.edad-t1.edad;
        }


        
    }
    class sortNombre implements Comparator<Empleado>{

        @Override
        public int compare(Empleado t, Empleado t1) {
            return t.nombre.compareTo(t1.nombre);
        }


        
    }
    class sortSueldo implements Comparator<Empleado>{

        @Override
        public int compare(Empleado t, Empleado t1) {
            return (int) (t.sueldo-t1.sueldo);
        } 
    }