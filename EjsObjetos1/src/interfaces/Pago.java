package interfaces;

public class Pago implements ProcesadorDePago{

	//implementar los métodos
	@Override
	public void realizarPago(double cantidad) {
		System.out.println("Pago de " + cantidad + "€ realizado con éxito");	
	}
	@Override
	public void reembolsarPago(double cantidad) {
		System.out.println("Reembolso de " + cantidad + "€ realizado con éxito");
		
	}

}
