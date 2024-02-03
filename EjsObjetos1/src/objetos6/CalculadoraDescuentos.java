package objetos6;

import javax.swing.JOptionPane;

public class CalculadoraDescuentos {
   
   //variables y constantes
   private double precio;
   private int cantidad;
   private final double porcentajeDescuento = 10.0; 
   
   //constructor
   public CalculadoraDescuentos() {
       this.precio = precio;
       this.cantidad = cantidad;
   }
   
   //setters
   public void establecerPrecio(double precio) {
       this.precio = precio;
   }
   public void establecerCantidad(int cantidad) {
       this.cantidad = cantidad;
   }

   //método para calcular el precio final según la cantidad
   public double calcularPrecioFinal() {
       return precio * cantidad - (precio * cantidad * porcentajeDescuento / 100); 
   }
   
   //método para aplicar el descuento según la cantidad
   public String aplicarDescuento() {
       if (cantidad > 5) {
            return "Precio final con descuento: " + calcularPrecioFinal();
        } else {
            return "No se puede aplicar el descuento";
        }
    }
}