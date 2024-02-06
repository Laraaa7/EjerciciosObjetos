package objetos7;

import javax.swing.JOptionPane;

public class ContadorLlamadas {

	//variable contador
	private static int contador = 0;

	//método para incrementar el contador
    public static void llamadas() {
        contador++;
        JOptionPane.showMessageDialog(null, "Llamada " + contador);
    }
    //método para obtener el número de llamadass
    public static int obtenerNumeroLlamadas() {
        return contador;
    }
}

