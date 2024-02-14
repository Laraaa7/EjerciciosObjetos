package abstracta;

public class Perro extends Animal {
	
	//implementar los métodos para perro
	@Override
	public void hacerSonido() {
		System.out.println("El perro ladra");
		
	}
	@Override
	public void moverse() {
		System.out.println("El perro corre\n");
		
	}
}
