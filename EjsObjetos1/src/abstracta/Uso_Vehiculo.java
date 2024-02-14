package abstracta;

public class Uso_Vehiculo {
	
	public static void main(String[] args) {
		
	   //instanciar
	   Vehiculo automovil = new Automovil();
       Vehiculo motocicleta = new Motocicleta();
      
       //llamar a los métodos acelerar y frenar
       automovil.acelerar();
       automovil.frenar();
     
       motocicleta.acelerar();
       motocicleta.frenar();
	}
}
