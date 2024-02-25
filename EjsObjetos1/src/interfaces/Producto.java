package interfaces;

public class Producto implements Inventariable {
	
   //variables
   private String nombre;
   private int stock;
   
   //constructor
   public Producto(String nombre, int stock) {
       this.nombre=nombre;
       this.stock=stock;
   }
   
   //implementar métodos
	@Override
	public int obtenerStock() {
		return stock;
	}
	@Override
	public void actualizarStock(int nuevoStock) {
		  this.stock += nuevoStock;
	}
	
	//getter
	public String getNombre() {
	    return nombre;
	}

}


