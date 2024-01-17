package objetos2;
public class uso_cuentaBancaria {
	public static void main(String[] args) {
	
		cuentaBancaria CuentaLara = new cuentaBancaria(); //instancia la clase cuentaBancaria y la asigna a la variable cuentaLara
		CuentaLara.establece_titular(); //llama al setter
		System.out.println(CuentaLara.dime_titular()); //llama al guetter e imprime el titular
		
		CuentaLara.establece_saldo(); //llama al setter
		System.out.println(CuentaLara.dime_saldo()); //llama al guetter e imprime el saldo
	}
}
