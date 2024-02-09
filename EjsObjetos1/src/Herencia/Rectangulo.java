package Herencia;

public class Rectangulo extends Figura{

	private double base;
    private double altura;
    
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	//implementar el método para calcular el área del rectángulo
	@Override
	double calcularArea() {
		return base * altura;
	}
	//implementar el método para obtener el nombre de la figura
	@Override
    String obtenerNombre() {
        return "Rectángulo";
    }
}
