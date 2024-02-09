package Herencia;

public class Vehiculo {
	
	//variables
	private String marca, modelo;
	private int año;
	
	//constructor
	public Vehiculo(String marca, String modelo, int año) {
		this.marca=marca;
		this.modelo=modelo;
		this.año=año;
	}
	//métodos para mostrar la información
	public void mostrarMarca() {
		System.out.println("La marca del vehículo es "+marca);
	}
	public void mostrarModelo() {
		System.out.println("El modelo del vehículo es "+modelo);
	}
	public void mostrarAño() {
		System.out.println("El año del vehículo es "+año);
	}
}
