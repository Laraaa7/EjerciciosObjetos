package sobrecarga;

public class Producto {
	
		//variables
		private String nombre;
		private double precio;
		private int CantidadStock;
		
		//constructor con nombre, precio y cantidadStock
		public Producto(String nombre, double precio, int cantidadStock) {
			this.nombre = nombre;
			this.precio = precio;
			this.CantidadStock = cantidadStock;
		}
		
		//constructor con nombre y precio
	   public Producto(String nombre, double precio) {
		   this.nombre = nombre;
		   this.precio = precio;
		   this.CantidadStock = 0;
	   }
	   
	   //constructor sin parámetros
	   public Producto() {
	       this.nombre = "Sin nombre";
		   this.precio = 0.0;
		   this.CantidadStock = 0;
	   }
	  
		//método para imprimir los detalles
		public void imprimirDetalles() {
			System.out.println("Nombre: " + nombre);
	        System.out.println("Precio: " + precio);
	        System.out.println("Cantidad en stock: " + CantidadStock);
	        System.out.println();
	    }
	}