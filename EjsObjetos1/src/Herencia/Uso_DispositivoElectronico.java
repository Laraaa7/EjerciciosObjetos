package Herencia;

public class Uso_DispositivoElectronico {

	public static void main(String[] args) {
		 
		Smartphone movil = new Smartphone("Xiaomi", 2023);
		
		System.out.println("Fabricante: " + movil.getFabricante());
		System.out.println("Año de fabricación: " + movil.getAñoDeFabricacion());
		System.out.println();
		
	    movil.llamar("123456789");
	    movil.recibirLlamadas();
	    movil.instalarAplicacion("WhatsApp");
	}
}

