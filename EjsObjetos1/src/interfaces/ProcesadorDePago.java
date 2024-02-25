package interfaces;

public interface ProcesadorDePago {
	
	//métodos para realizar y reembolsar un pago
	public void realizarPago(double cantidad);
	public void reembolsarPago(double cantidad);

}
