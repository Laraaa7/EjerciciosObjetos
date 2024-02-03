package objetos6;
public class ConversorTemperatura {
	
   //variables y constantes
   private double temperaturaCelsius;
   private final double factorConversion = 1.8;
   private final int ajuste = 32;
  
   //constructor
   public ConversorTemperatura(){
   		this.temperaturaCelsius = temperaturaCelsius;
   }
   //setter
	public void establecerTemperaturaCelsius(double temperaturaCelsius) {
		this.temperaturaCelsius = temperaturaCelsius;
	}
   //método para pasar a Fahrenheit
	public double calcularFahrenheit() {
		return temperaturaCelsius * factorConversion + ajuste;
		
	}	
}
