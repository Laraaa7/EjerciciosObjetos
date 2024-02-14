package abstracta;

public class PersistenciaBaseDatos extends Persistencia {
	
	//implementar los métodos para PersistenciaBaseDatos
	@Override
	public void guardarDatos(String datos) {
		System.out.println("Guardando datos en la base de datos: "+datos);
		
	}
	@Override
	  public String cargarDatos() {
		System.out.println("Cargando datos de la base de datos...");
		 return "Datos cargados desde la base de datos";
	}
}
