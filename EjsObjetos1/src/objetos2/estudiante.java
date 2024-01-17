package objetos2;
public class estudiante {
	
	//declarar variables
	private String nombre;
	private int edad;
	private double calificacion;
	
	//constructor
	public estudiante() {
		nombre="Lara";
		edad=200;
		calificacion=8.5;
	}
	
	public String dime_nombre() {	//getter
		return "El nombre del estudiante es " + nombre;
	}
	public void establece_nombre() { //setter
		nombre="Lara";
	}
	public String dime_edad() { //getter
		return "La edad del estudiante es " + edad;
	}
	public void establece_edad() { //setter
		
		if (edad>=0 & edad<=100) {
			edad=edad;
		}else {
			System.out.println("La edad solo puede ser de 0 a 100 años y tiene que ser un número positivo");
		}
		}


	public String dime_calificacion() { //getter
		return "La calificación del estudiante es " + calificacion;
	}
	public void establece_calificacion() { //setter
		calificacion=8.5;	
		}
	}



