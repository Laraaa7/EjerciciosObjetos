package objetos7;

import javax.swing.JOptionPane;

public class Uso_ContadorLlamadas {

	public static void main(String[] args) {
		
	    //llamar al método
	    for (int i = 0; i < 5; i++) {
	        ContadorLlamadas.llamadas();
	    }

	    //mostrar el número de llamadas al método
	    JOptionPane.showMessageDialog(null,"El método ha sido llamado " + ContadorLlamadas.obtenerNumeroLlamadas() + " veces");
	}
}

