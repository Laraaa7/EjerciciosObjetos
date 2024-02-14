package abstracta;

public class Uso_Persistencia {
	
	public static void main(String[] args) {
		
		//instanciar
		Persistencia perArchivo = new PersistenciaArchivo();
		Persistencia perBD = new PersistenciaBaseDatos();
		
		//llamar a los métodos guardarDatos y cargarDatos
		perArchivo.guardarDatos("datos a guardar en el archivo");
		System.out.println(perArchivo.cargarDatos());
		
		perBD.guardarDatos("datos a guardar en la base de datos");
		System.out.println(perBD.cargarDatos());
	}
}
