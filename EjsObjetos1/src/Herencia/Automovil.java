package Herencia;

public class Automovil extends Vehiculo {
	
	private String tipoDeCombustible;
	
	//constructor
	public Automovil(String marca, String modelo, int año, String tipoDeCombustible) {
		super(marca, modelo, año);
		this.tipoDeCombustible = tipoDeCombustible;
	}
	public void mostrarInfo() {
	     //llamar a los métodos de la clase Vehiculo
	     mostrarMarca();
	     mostrarModelo();
	     mostrarAño();
	     System.out.println("El tipo de combustible es " + tipoDeCombustible);
	 }
	
}
