package objetos7;

public class ConvertidorUnidades {

	//métodos para conversiones de unidades
	public static double kilometrosAMillas(double kilometros) {
		return kilometros *  0.621371;
	}
	
	public static double millasAKilometros(double millas) {
		return millas /  0.621371;
	}
	
	public static double celsiusAFahrenheit(double celsius) {
		return celsius *  1.8 + 32;
	}
	
	public static double fahrenheitACelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}
	
	//método para elegir una opción de conversión
	public static double convertirValor(int opcion, double valor) {
		switch (opcion) {
			case 1:
				return kilometrosAMillas(valor);
			case 2:
				return millasAKilometros(valor);
			case 3:
				return celsiusAFahrenheit(valor);
			case 4:
				return fahrenheitACelsius(valor);
			default:
				return 0;
		}
	}
}


