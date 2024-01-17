package objetos2;
public class uso_automovil {
	public static void main(String[] args) {
		
		automovil Seat = new automovil(); //Instanciar la clase automovil y asignarla a la variable Seat
		Seat.establece_marca(); //llama al setter
		System.out.println(Seat.dime_marca()); //llama al guetter e imprime la marca del automovil
		
		Seat.establece_modelo(); //llama al setter
		System.out.println(Seat.dime_modelo()); //llama al guetter e imprime el modelo del automovil
	}
}

