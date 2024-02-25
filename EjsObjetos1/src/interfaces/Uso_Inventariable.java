package interfaces;

public class Uso_Inventariable {
	
	public static void main(String[] args) {
		
		//instanciar
		Producto producto = new Producto("Camiseta", 20);
		
		
		//imprimir stock inicial
		System.out.println("El stock inicial de " + producto.getNombre() + " es de: " + producto.obtenerStock());
		
		//actualizar el stock
		producto.actualizarStock(5);
		
		//imprimir stock actualizado
	    System.out.println("El nuevo stock es de " + producto.getNombre()+ " es de: " + producto.obtenerStock());
	    }
	}

