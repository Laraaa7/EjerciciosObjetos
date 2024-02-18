package sobrecarga;

public class Uso_Rectangulo {
	
	 public static void main(String[] args) {
		
		 	//instanciar
	        Rectangulo rectangulo1 = new Rectangulo(3.0, 5.0);
	        Rectangulo rectangulo2 = new Rectangulo();

	        
	        //imprimir la información
	        System.out.println("-Rectángulo 1-");
	        rectangulo1.imprimirInformacion();
	        
	        System.out.println("-Rectángulo 2-");
	        rectangulo2.imprimirInformacion();
	    }
	}
