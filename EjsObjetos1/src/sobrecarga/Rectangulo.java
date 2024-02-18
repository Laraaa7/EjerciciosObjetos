package sobrecarga;

public class Rectangulo {
	
		//variables
	    private double ancho,altura;
	    
	    //constructor con ancho y altura
	    public Rectangulo(double ancho, double altura) {
	        this.ancho = ancho;
	        this.altura = altura;
	    }
	    
	    //constructor sin parámetros
	    public Rectangulo() {
	    	this.ancho = 0.0;
	        this.altura = 0.0;
	    }
	   
	    //método para calcular el área
	    public double calcularArea() {
	        return ancho * altura;
	    }
	    
	    //método para imprimir la información
	    public void imprimirInformacion() {
	        System.out.println("Ancho: " + ancho);
	        System.out.println("Altura: " + altura);
	        System.out.println("Área: " + calcularArea());
	        System.out.println();
	    }
	}
