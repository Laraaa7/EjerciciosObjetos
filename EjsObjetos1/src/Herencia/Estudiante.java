package Herencia;

public class Estudiante extends Persona{
	
	//variable
	private String carrera;
	
	//constructor
	public Estudiante(String nombre, int edad, String carrera) {
		super(nombre, edad);
		this.carrera = carrera;
	}

	//getter
	public String getCarrera() {
		return carrera;
	}
}
