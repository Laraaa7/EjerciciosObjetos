package objetos6;
public class CalculadoraImpuestos {
   
   private double precio; //variable
   private final double porcentajeImpuesto = 0.15; //constante
   
   //constructor
   public CalculadoraImpuestos() {
       this.precio = precio;
   }
   //setter
   public void establecerPrecio(double precio) {
       this.precio = precio;
   }
 
   //método para calcular el precio final
   public double calcularPrecioFinal() {
       return precio + (precio * porcentajeImpuesto);
   }
}
