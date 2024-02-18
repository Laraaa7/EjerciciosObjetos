package sobrecarga;

public class Coche {
	
	//variables
	private String marca, modelo, color;
	private int año;
	
	//constructor con marca, modelo, color y año
	public Coche(String marca, String modelo, String color, int año) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.año = año;
	}
	
	//constructor con marca, modelo y año
	public Coche(String marca, String modelo, int año) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = "Sin color";
		this.año =  año;
	}
	
	//constructor con marca y modelo
	public Coche(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = "Sin color";
		this.año = 0;
	}
	
	//constructor sin parámetros
	public Coche() {
		this.marca = "Sin marca";
		this.modelo = "Sin modelo";
		this.color = "Sin color";
		this.año = 0;
	}
	
	//método para imprimir los detalles
	public void imprimirDetalles() {
		System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Color: " + color);
        System.out.println();
    }
}