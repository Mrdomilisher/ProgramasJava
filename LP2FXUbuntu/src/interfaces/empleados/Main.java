package interfaces.empleados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Empleado> emp = new ArrayList<Empleado>();
        emp.add(new Empleado("Abelardo", 4000, 55));
        emp.add(new Empleado());
        emp.add(new Empleado("Erick", 4500, 36));

        System.out.println("Ordenar por Nombre");
        Collections.sort(emp, new sortNombre());
        for (int i = 0; i < emp.size(); i++) {
            System.out.println(emp.get(i));
        }

        System.out.println("\nOrdenar por Edad");
        Collections.sort(emp, new sortEdad());
        for (int i = 0; i < emp.size(); i++) {
            System.out.println(emp.get(i));
        }

        System.out.println("\nOrdenar por Sueldo");
        Collections.sort(emp, new sortSueldo());
        for (int i = 0; i < emp.size(); i++) {
            System.out.println(emp.get(i));
        }
        
        
        
        Empleado[] emp2 = {new Empleado("Yolanda", 6500, 45), new Empleado(),new Empleado("Juan",2000,33)};
        Arrays.sort(emp2, new sortNombre());
        System.out.println("Ordenar por Nombre");

        System.out.println(Arrays.toString(emp2));
        Arrays.sort(emp2, new sortEdad());
        System.out.println("\nOrdenar por Edad");

        System.out.println(Arrays.toString(emp2));

        Arrays.sort(emp2, new sortSueldo());
        System.out.println("\nOrdenar por Sueldo");

        System.out.println(Arrays.toString(emp2));
    }

}
