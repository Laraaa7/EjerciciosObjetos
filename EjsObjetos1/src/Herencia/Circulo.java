package Herencia;

public class Circulo extends Figura{

	//variable
	private double radio;

	//constructor
	public Circulo(double radio) {
		this.radio = radio;
	}
	//implementar el método para calcular el área del círculo
	@Override
	double calcularArea() {
		return radio * radio * 3.14159;
	}
	//implementar el método para obtener el nombre de la figura
	@Override
    String obtenerNombre() {
        return "Círculo";
    }
}
