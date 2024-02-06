package objetos7;
public class ContadorInstancias {
	
   //variable contador
   private static int contador = 0;
   
   //constructor
   public ContadorInstancias() {
       contador++; //incrementa el contador
   }
   
   //método para obtener el número de instancias
   public static int obtenerInstancias() {
       return contador;
   }
}

