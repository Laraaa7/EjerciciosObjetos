package interfaces;

public class formatoPDF implements Exportable {
   
   //implementar método para exportar en formato PDF
   @Override
   public void exportarDatos() {
       System.out.println("Exportando datos a formato PDF...");
   }       
}