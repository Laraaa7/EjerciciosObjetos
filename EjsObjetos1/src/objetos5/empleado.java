package objetos5;
import java.util.GregorianCalendar;

public class empleado {
    
    //atributos
    private String nombre;
    private double sueldo;
    private GregorianCalendar fechaContrato;
    
    //constructor
    public empleado(String nombre, double sueldo, int año, int mes, int dia){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.fechaContrato = new GregorianCalendar(año, mes - 1, dia);
    }
    
    //getters y setters
    public String dameNombre() {
        return nombre;
    }
    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }
    public double dameSueldo() { 
        return sueldo;
    }
    public void establecerSueldo(double sueldo) { 
        this.sueldo = sueldo;
    }
    public GregorianCalendar dameFechaContrato() { 
        return fechaContrato;
    }
    public void establecerFechaContrato(GregorianCalendar fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    //método para aumentar el sueldo
    public void subeSueldo(double porcentaje) {
        double aumento = porcentaje / 100.0;
        sueldo += sueldo * aumento;
    }
}
