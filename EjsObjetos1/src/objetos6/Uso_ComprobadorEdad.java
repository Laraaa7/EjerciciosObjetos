package objetos6;
import javax.swing.JOptionPane;
public class Uso_ComprobadorEdad {
	public static void main(String[] args) {
		
		ComprobadorEdad edadVotar = new ComprobadorEdad();
		edadVotar.establecerEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad:")));
       JOptionPane.showMessageDialog(null, edadVotar.comprobarEdad());
	}
}
