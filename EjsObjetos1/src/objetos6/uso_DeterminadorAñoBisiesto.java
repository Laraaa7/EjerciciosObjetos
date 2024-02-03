package objetos6;

import javax.swing.JOptionPane;

public class uso_DeterminadorAñoBisiesto {

	public static void main(String[] args) {
		
		DeterminadorAñoBisiesto bisiesto = new DeterminadorAñoBisiesto();
		bisiesto.establecerAño(Integer.parseInt(JOptionPane.showInputDialog("Introduce un año para saber si es bisiesto: ")));
        JOptionPane.showMessageDialog(null,  bisiesto.determinarBisiesto());
	}
}

