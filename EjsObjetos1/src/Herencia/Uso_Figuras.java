package Herencia;

public class Uso_Figuras {

	public static void main(String[] args) {
			
		   //array
		   Figura[] figuras = new Figura[2];
		   
		   figuras[0] = new Circulo(6.0);
	       figuras[1] = new Rectangulo(4.0, 6.0);
	       
	       for (Figura figura : figuras) {
	            System.out.println("Área del " + figura.obtenerNombre() + ": " + figura.calcularArea());
	        }

	}

}
