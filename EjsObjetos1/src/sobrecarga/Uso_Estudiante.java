package sobrecarga;

public class Uso_Estudiante {

	public static void main(String[] args) {
		
		//instanciar
		Estudiante estudiante1 = new Estudiante("Pepe", 18, 8.5);
		Estudiante estudiante2 = new Estudiante("Pepa", 20);
		Estudiante estudiante3 = new Estudiante();

		System.out.println("-Estudiante 1-");
		estudiante1.imprimirDetalles();
		
		System.out.println("-Estudiante 2-");
		estudiante2.imprimirDetalles();
		
		System.out.println("-Estudiante 3-");
		estudiante3.imprimirDetalles();
	}

}
