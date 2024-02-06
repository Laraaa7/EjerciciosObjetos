package objetos7;

import javax.swing.JOptionPane;

public class Uso_Validador {

    public static void main(String[] args) {
       
    	//validar si una cadena es un número
        String inputCadena = JOptionPane.showInputDialog("Introduce una cadena para comprobar si es un número:");
        boolean esNumero = Validador.esNumero(inputCadena);
        if (esNumero) {
            JOptionPane.showMessageDialog(null, "La cadena '" + inputCadena + "' es un número");
        } else {
            JOptionPane.showMessageDialog(null, "La cadena '" + inputCadena + "' no es un número");
        }

        //validar que un número está en el rango
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Introduce un número para saber si está en el rango:"));
        double minimo = 50.0;
        double maximo = 100.0;
        boolean estaEnRango = Validador.estaEnRango(numero, minimo, maximo);
        
        if (estaEnRango) {
            JOptionPane.showMessageDialog(null, "El número " + numero + " está en el rango [50, 100]");
        } else {
            JOptionPane.showMessageDialog(null, "El número " + numero + " no está en el rango [500, 100]");
        }
    }
}
