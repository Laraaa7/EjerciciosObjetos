package abstracta;
public class EmpleadoTiempoParcial extends Empleado{
	
	//variables
	private double horas;
	private double tarifa;
	
	//constructor
	public EmpleadoTiempoParcial(double horas, double tarifa) {
		this.horas = horas;
		this.tarifa = tarifa;
		}
	    
	//implementación de calcularSalario
	@Override
	public double calcularSalario() {
		return horas * tarifa;
	    }
	}
                   