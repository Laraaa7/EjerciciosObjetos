package interfaces;

 public class formatoCSV implements Exportable {
	 
	//implementar método para exportar en formato CSV
     @Override
     public void exportarDatos() {
         System.out.println("Exportando datos a formato CSV...");
     }
 }
