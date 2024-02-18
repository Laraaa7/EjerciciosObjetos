package sobrecarga;

public class Estudiante {
	
	//variables
	private String nombre;
	private int edad;
	private double promedio;
	
	//constructor con nombre, edad y promedio
	public Estudiante(String nombre, int edad, double promedio) {
		this.nombre = nombre;
		this.edad = edad;
		this.promedio = promedio;
	}	

	//constructor con nombre y edad
	public Estudiante(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.promedio = 0.0;
	}	
	 
	//constructor sin parámetros
	public Estudiante() {
		this.nombre = "Sin nombre";
		this.edad = 0;
		this.promedio = 0.0;
	}
		
	//método para imprimir los detalles
	public void imprimirDetalles() {
		System.out.println("Nombre: " + nombre);
	    System.out.println("Edad: " + edad);
	    System.out.println("Promedio: " + promedio);
	    System.out.println();
	    }
	}	
