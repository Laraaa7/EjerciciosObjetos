package objetos2;

public class estudiante {
	
	private String nombre;
	private int edad;
	private double calificacion;
	
	
public String dime_nombre() {
		
		return "El nombre del estudiante es " + nombre;
		
	}
	public void establece_nombre() {
		nombre="Lara";
	}
	
	public String dime_edad() {
		return "La edad del estudiante es " + edad;
	}
	public void establece_edad() {
		edad=101;
		
		if (edad>=0 & edad<=100) {
			edad=edad;
		}else {
			System.out.println("La edad solo puede ser de 0 a 100 años y un número positivo");
		}
		}
	public String dime_calificacion() {
		return "La calificación del estudiante es " + calificacion;
	}
	public void establece_calificacion() {
		calificacion=8.5;	
		}
	}



