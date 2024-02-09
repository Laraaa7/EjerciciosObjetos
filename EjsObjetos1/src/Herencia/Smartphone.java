package Herencia;

public class Smartphone extends DispositivoElectronico { //hereda de DispositivoElectronico

	//constructor
	public Smartphone(String fabricante, int añoDeFabricacion) {
        super(fabricante, añoDeFabricacion);
    }

	//métodos para implementar la clase Telefono
	public void llamar(String numero) {
	    System.out.println("Llamando al número: " + numero);
	}
	
	public void recibirLlamadas() {
	    System.out.println("Recibiendo llamadas...");
	}
	
	//método de la clase Smartphone
	public void instalarAplicacion(String aplicacion) {
	    System.out.println("Instalando aplicación: " + aplicacion);
	}
}





