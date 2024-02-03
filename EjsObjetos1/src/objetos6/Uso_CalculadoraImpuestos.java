package objetos6;
import javax.swing.JOptionPane;
public class Uso_CalculadoraImpuestos {
	public static void main(String[] args) {
		
       CalculadoraImpuestos impuestos = new CalculadoraImpuestos();
       impuestos.establecerPrecio(Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del producto:")));
       JOptionPane.showMessageDialog(null, "El precio final con impuestos es de " + impuestos.calcularPrecioFinal() + "€");
   }
	}
