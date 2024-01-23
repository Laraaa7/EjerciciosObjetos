package objetos3;
import java.util.ArrayList;
public class receta {
 	//declarar variables
  private String plato;
  private ArrayList<String> ingredientes;
  private ArrayList<String> pasos;
 
  //constructor
  public receta(String plato) {
      this.plato = plato;
      this.ingredientes = new ArrayList<>();
      this.pasos = new ArrayList<>();
  }
  public String dime_plato() { //getter
      return this.plato;
  }
  public void establece_plato(String plato) { //setter
      this.plato = plato;
  }
  public ArrayList<String> dime_ingredientes() { //getter
      return this.ingredientes;
  }
  public void establece_ingredientes(ArrayList<String> ingredientes) { //setter
      this.ingredientes = ingredientes;
  }
  public ArrayList<String> dime_pasos() { //getter
      return this.pasos;
  }
  public void establece_pasos(ArrayList<String> pasos) { //setter
      this.pasos = pasos;
  }
   public void añadirIngrediente(String ingrediente) { //método para añadir ingredientes a la lista de ingredientes
  	this.ingredientes.add(ingrediente);
  }
  public void eliminarIngrediente(String ingrediente) { //método para eliminar ingredientes de la lista de ingredientes
  	this.ingredientes.remove(ingrediente);
  }
  public void añadirPaso(String paso) { //método para añadir pasos a la lista de pasos
  	this.pasos.add(paso);
  }
  //método para mostrar la receta imprimiendo el nombre del plato, la lista de ingredientes y de pasos
  public void mostrarReceta() {
      System.out.println("Receta para " + plato + ":");
      System.out.println("\nIngredientes:");
      for (String ingrediente : ingredientes) {
          System.out.println("- " + ingrediente);
      }
    
      System.out.println("\nPasos:");
      int numPaso = 1;
      for (String paso : pasos) {
          System.out.println(numPaso++ + ". " + paso);
      }
  }
}
