package objetos2;
public class producto {
	
	//atributos de la clase
	private String nombre;
	private double precio;
	private int stock;
	
	//constructor
	public producto() {
		nombre="Ordenador de sobremesa";
		precio=1000.99;
		stock=-30;
	}
	
	public String dime_nombre() { //getter
	return "El nombre del producto es " + nombre;
	}
	public void establece_nombre() { //setter
		nombre="Ordenador de sobremesa";
	}
	public String dime_precio() { //getter
		return "El precio del producto es de " + precio + " euros";
	}
	public void establece_precio() { //setter
		precio=1000.99;
	}
	public String dime_stock() { //getter
		return "El stock del producto es de " + stock;
	}
	public void establece_stock() { //setter
		stock=-30;
		if (stock >= 0) {
	        stock = stock;
	    } else {
	        System.out.println("El stock no puede ser negativo");
	    }
	}
}
