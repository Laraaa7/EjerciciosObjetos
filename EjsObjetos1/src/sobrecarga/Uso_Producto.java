package sobrecarga;

public class Uso_Producto {
	
	public static void main(String[] args) {
	
	//instanciar
	Producto producto1 = new Producto("Mesa", 150.0, 10);
	Producto producto2 = new Producto("Silla", 50.0);
	Producto producto3 = new Producto();
   
	//imprimir detalles
	System.out.println("-Producto 1-");
	producto1.imprimirDetalles();
	
	System.out.println("-Producto 2-");
	producto2.imprimirDetalles();
	
	System.out.println("-Producto 3-");
	producto3.imprimirDetalles();

	}
}
 