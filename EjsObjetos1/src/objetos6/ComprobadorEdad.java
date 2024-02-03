package objetos6;
public class ComprobadorEdad {

   private int edad; //variable
   private final int edadMinima = 18; //constante
  
   //constructor
   public ComprobadorEdad(){
   	this.edad= edad;
   }
   //setter
	public void establecerEdad(int edad) {
		this.edad = edad;
	}
	//método para comprobar la edad mínima
	public String comprobarEdad() {
		if (edad >= edadMinima) {
			return "Es elegible para votar";
		}else {
			return "No es elegible para votar";
		}	
	}
}
