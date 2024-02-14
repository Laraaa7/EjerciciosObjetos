package abstracta;

public class Circulo extends FiguraGeometrica{
	
	//variable
	private double radio;
	
	//constructor
	public Circulo(double radio) {
		this.radio = radio;
	}
	//implementar el método para calcular el área del círculo
	@Override
	public double calcularArea() {
		return radio * Math.PI;
	}
}
