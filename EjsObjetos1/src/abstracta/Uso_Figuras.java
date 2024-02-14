package abstracta;

public class Uso_Figuras {
	
	public static void main(String[] args) {
			
		   //instanciar
		   Rectangulo rectangulo = new Rectangulo(2, 3);
	       Circulo circulo = new Circulo(4);
	       
	       //imprimir resultados
	       System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
	       System.out.println("Área del círculo: " + circulo.calcularArea());
	   
	}
}
