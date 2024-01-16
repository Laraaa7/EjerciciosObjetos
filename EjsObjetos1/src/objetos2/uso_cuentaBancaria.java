package objetos2;

public class uso_cuentaBancaria {

	public static void main(String[] args) {
	
		cuentaBancaria CuentaLara = new cuentaBancaria();
		CuentaLara.establece_titular();
		System.out.println(CuentaLara.dime_titular());
		
		CuentaLara.establece_saldo();
		System.out.println(CuentaLara.dime_saldo());
	}

}
