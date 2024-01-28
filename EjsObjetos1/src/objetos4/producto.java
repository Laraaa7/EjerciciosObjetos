package objetos4;

public class producto {

	//atributos
	private String nombre;
	private int cantidad;
	private double precio;
	
	//constructor
	public producto() {
		this.nombre=nombre;
		this.cantidad=cantidad;
		this.precio=precio;
	}

	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	//método para el resumen del inventario
	public String Resumen() {
		 return "Nombre del producto: " + this.nombre + "\nCantidad del producto: "
				 + this.cantidad +"\nPrecio del producto: " + this.precio + " €";
		}
	
}

