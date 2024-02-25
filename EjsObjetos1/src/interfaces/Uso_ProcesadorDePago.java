package interfaces;

import javax.swing.JOptionPane;

public class Uso_ProcesadorDePago {

    public static void main(String[] args) {

        // instanciar
        ProcesadorDePago procesador = new Pago();

        // realizar y reembolsar un pago
        double cantidadPago = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad a pagar:"));
        procesador.realizarPago(cantidadPago);

        double cantidadReembolso = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad a reembolsar:"));
        procesador.reembolsarPago(cantidadReembolso);
    }
}
