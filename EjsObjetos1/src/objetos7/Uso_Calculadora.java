package objetos7;

import javax.swing.JOptionPane;

public class Uso_Calculadora {

	public static void main(String[] args) {
		

		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo número:"));
        
        //mostrar resultados
        String resultados = "Resultados de las operaciones\n\n" +
        		"Suma: " + Calculadora.suma(num1, num2) +
        		"\nResta: " + Calculadora.resta(num1, num2) +
        		"\nMultiplicación: " + Calculadora.multiplicacion(num1, num2) +
        		"\nDivisión: " + Calculadora.division(num1, num2);
        JOptionPane.showMessageDialog(null, resultados);
	}

}
