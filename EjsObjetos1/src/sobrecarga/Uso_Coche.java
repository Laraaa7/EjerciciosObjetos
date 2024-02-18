package sobrecarga;

public class Uso_Coche {

	public static void main(String[] args) {
		
		//instanciar
		Coche coche1 = new Coche("Mitsubishi", "Colt", "Rojo", 2023);
		Coche coche2 = new Coche("Kia", "Rio", 2021);
		Coche coche3 = new Coche("Hyundai", "Bayon");
		Coche coche4 = new Coche();
		
		//imprimir detalles
		System.out.println("-Coche 1-");
		coche1.imprimirDetalles();
		
		System.out.println("-Coche 2-");
		coche2.imprimirDetalles();
		
		System.out.println("-Coche 3-");
		coche3.imprimirDetalles();
		
		System.out.println("-Coche 4-");
		coche4.imprimirDetalles();
	}

}
