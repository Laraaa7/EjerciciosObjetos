package objetos3;

public class uso_reservaHotel {

	public static void main(String[] args) {
		hotel hotel = new hotel(); //instanciar la clase
		
		//carga los valores de las variables
		habitacion habitacion1 = new habitacion(5, "simple");
		habitacion habitacion2 = new habitacion(6, "doble");
		habitacion habitacion3 = new habitacion(7, "suite");

		// añadir habitaciones al hotel
		hotel.habitaciones.add(habitacion1);
		hotel.habitaciones.add(habitacion2);
		hotel.habitaciones.add(habitacion3);

		// reservar una habitación
		hotel.reservar_Habitacion(6);
		
	}

}
