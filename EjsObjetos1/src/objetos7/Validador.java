package objetos7;

public class Validador {

	  //método para verificar si una cadena de texto es un número
	   public static boolean esNumero(String cadena) {
	        try {
	            Double.parseDouble(cadena); //intenta convertir la cadena a un valor de tipo double
	            return true; //si la puede convertir, la cadena es un número válido
	        } catch (NumberFormatException e) { //si no, la cadena no es un número válido
	            return false;
	        }
	    }

	   //método para saber si el número introducido está en el rango
	    public static boolean estaEnRango(double numero, double minimo, double maximo) {
	        return numero >= minimo && numero <= maximo;
	    }
}
