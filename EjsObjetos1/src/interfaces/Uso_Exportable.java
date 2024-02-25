package interfaces;
public class Uso_Exportable {

	public static void main(String[] args) {
		
		//instanciar
		Exportable archivoCSV = new formatoCSV();
		Exportable archivoPDF = new formatoPDF();
		
		//mostrar información
		archivoCSV.exportarDatos();
		archivoPDF.exportarDatos();
	}

}
