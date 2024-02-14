package abstracta;

public class EmpleadoTiempoCompleto extends Empleado{
	
	//variable
	 private double salario;
	    
	 //constructor
	 public EmpleadoTiempoCompleto(double salario) {
		 this.salario = salario;
	    }
	
	 //implementar el método para calcularSalario
	 @Override
	 public double calcularSalario() {
		 return salario;
		 }
	 }
