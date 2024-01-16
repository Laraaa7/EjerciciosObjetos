package objetos2;

public class automovil {

	private String marca, modelo;
	
	public String dime_marca() {
		return "La marca del automovil es " + marca;
	}
	public void establece_marca() {
		marca="Tesla";
	}
	
	public String dime_modelo() {
		return "El modelo del automovil es " + modelo;
	}
	public void establece_modelo() {
		modelo="XT";
	}
}
