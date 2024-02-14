package abstracta;

public class Uso_Animal {
	
	public static void main(String[] args) {
		
		//instanciar
		Animal perro = new Perro();
		Animal gato = new Gato();
		
		//llamar a los métodos hacerSonido y moverse
		perro.hacerSonido();
		perro.moverse();
		
		gato.hacerSonido();
		gato.moverse();
	}
}
