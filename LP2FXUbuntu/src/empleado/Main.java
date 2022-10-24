package empleado;

public class Main {

    public static void main(String[] args) {
        Empleado[] empleados = {
            new EmpleadoSueldo(),
            new EmpleadoSueldo(500, "Jose"),
            new EmpleadoHoras(40, 100),
            new EmpleadoHoras(150, 40, "Manuel")
        };
        for (Empleado empleado : empleados) {
            System.out.println(empleado + " Sueldo= " + empleado.getSueldo());
        }
    }

}