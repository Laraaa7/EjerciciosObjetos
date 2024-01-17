package objetos2;
public class automovil {
	private String marca, modelo; //declarar variables
	
	public automovil(){ //constructor
		marca="Seat";
		modelo="Ibiza";
	}
	public String dime_marca() { //getter
		return "La marca del automovil es " + marca;
	}
	public void establece_marca() { //setter
		marca="Seat";
	}
	
	public String dime_modelo() { //getter
		return "El modelo del automovil es " + modelo;
	}
	public void establece_modelo() { //setter
		modelo="Ibiza";
	}
}
