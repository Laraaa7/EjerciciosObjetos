package objetos2;
public class cuentaBancaria {
	
	//declarar variables
	private String titular;
	private double saldo;
	
	//constructor
	public cuentaBancaria() {
		titular="Lara";
		saldo=-5;
	}
	public String dime_titular() {	//getter
	return "El titular de la cuenta es " + titular;
		
	}
	public void establece_titular() { //setter
		titular="Lara";
	}
	
	public String dime_saldo() { //getter
		return "El saldo de la cuenta es " + saldo;
	}
	public void establece_saldo() { //setter
		
		if (saldo >= 0) {
			saldo = saldo;
		} else {
			System.out.println("El saldo no puede ser negativo.");
		}
	}
}
