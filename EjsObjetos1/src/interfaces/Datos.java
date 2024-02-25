package interfaces;

public class Datos implements Filtrable, Ordenable{

	//implementar métodos para filtrar y ordenar datos
	@Override
	public void filtrarDatos() {
		System.out.println("Filtrando los datos...");
		
	}
	
	@Override
	public void ordenarDatos() {
		System.out.println("Ordenando los datos...");
		
	}

	

}
