package abstracta;

public class PersistenciaArchivo extends Persistencia{
	
	//implementar los métodos para PersistenciaArchivo
	@Override
	public void guardarDatos(String datos) {
		System.out.println("Guardando datos en el archivo: "+datos);
		
	}
	@Override
	public String cargarDatos() {
		System.out.println("Cargando datos del archivo...");
		return "Datos cargados desde el archivo\n";
	}
}
