package objetos2;

public class cuentaBancaria {

	private String titular;
	private double saldo;

	public String dime_titular() {	
	return "El titular de la cuenta es " + titular;
		
	}
	public void establece_titular() {
		titular="Lara";
	}
	
	public String dime_saldo() {
		return "El saldo de la cuenta es " + saldo;
	}
	public void establece_saldo() {
		saldo=-5;	
		if (saldo >= 0) {
			saldo = saldo;
		} else {
			System.out.println("El saldo no puede ser negativo.");
		}
	}
}
	

