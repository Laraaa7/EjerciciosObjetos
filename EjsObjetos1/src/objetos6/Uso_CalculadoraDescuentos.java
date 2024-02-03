package objetos6;

import javax.swing.JOptionPane;

public class Uso_CalculadoraDescuentos {
    
    public static void main(String[] args) {
        
        CalculadoraDescuentos descuento = new CalculadoraDescuentos();
        descuento.establecerPrecio(Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del producto: ")));
        descuento.establecerCantidad(Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad del producto:")));
       JOptionPane.showMessageDialog(null,  descuento.aplicarDescuento());
    }
}