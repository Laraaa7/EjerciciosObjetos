package objetos7;

import javax.swing.JOptionPane;

public class Uso_ContadorInstancias {

	public static void main(String[] args) {
		
		 ContadorInstancias instancia1 = new ContadorInstancias();
	     ContadorInstancias instancia2 = new ContadorInstancias();
	     ContadorInstancias instancia3 = new ContadorInstancias();

	     JOptionPane.showMessageDialog(null, "El número actual de instancias es: " + ContadorInstancias.obtenerInstancias());
	}

}
