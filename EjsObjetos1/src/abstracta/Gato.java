package abstracta;

public class Gato extends Animal{
	
	//implementar los métodos para gato
	@Override
	public void hacerSonido() {
		System.out.println("El gato maulla");
		
	}
	@Override
	public void moverse() {
		System.out.println("El gato camina");
		
	}
}
