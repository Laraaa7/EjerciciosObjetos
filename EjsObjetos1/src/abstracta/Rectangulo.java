package abstracta;

public class Rectangulo extends FiguraGeometrica{
	
		//variables
		private double base;
		private double altura;
	 
	   //constructor
		public Rectangulo(double base, double altura) {
			this.base = base;
			this.altura = altura;
		}
		//implementar el método para calcular el área del rectángulo
		@Override
		public double calcularArea() {
			return base * altura;
		}
	}
