package empleado;

public class EmpleadoHoras extends Empleado {

    private int horasSemana;
    private double horaPago;

    public EmpleadoHoras() {
        super("Juan");
    }

    public EmpleadoHoras(int horasSemana, double horaPago) {
        this(horasSemana,horaPago,"Juan");
    }
    public EmpleadoHoras(int horasSemana, double horaPago,String nombre) {
        super(nombre);
        this.horasSemana = horasSemana;
        this.horaPago = horaPago;
    }
    
        public double getHoraPago() {
        return horaPago;
    }

    public void setHoraPago(double horaPago) {
        this.horaPago = horaPago;
    }

    public int getHorasSemana() {
        return horasSemana;
    }

    public void setHorasSemana(int horasSemana) {
        this.horasSemana = horasSemana;
    }
    

    @Override
    public double getSueldo() {
        double x=horaPago*horasSemana;
        return x;   
    }

    @Override
    public String toString() {
        return "EmpleadoHoras{" + "horasSemana=" + horasSemana + ", horaPago=" + horaPago + " "+super.toString()+'}';
    }
    

}
