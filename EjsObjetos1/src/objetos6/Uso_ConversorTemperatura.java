package objetos6;
import javax.swing.JOptionPane;
public class Uso_ConversorTemperatura {
	public static void main(String[] args) {
		
		ConversorTemperatura temperatura = new ConversorTemperatura();
       temperatura.establecerTemperaturaCelsius(Double.parseDouble(JOptionPane.showInputDialog("Introduce la temperatura en grados Celsius:")));
       JOptionPane.showMessageDialog(null, "La temperatura en grados Fahrenheit es  " +  temperatura.calcularFahrenheit() + " °F");
	}
}
