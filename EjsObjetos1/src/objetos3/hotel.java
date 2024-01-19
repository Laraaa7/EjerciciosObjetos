package objetos3;
import java.util.ArrayList;

public class hotel {
	ArrayList<habitacion> habitaciones;// crea una lista de habitaciones

	// constructor
	public hotel() {
		this.habitaciones = new ArrayList<>();
	}

	// método para reservar las habitaciones
	public void reservar_Habitacion(int numero) {
		if (verificar_Disponibilidad(numero)) {
			for (habitacion ha : habitaciones) {
				if (ha.dime_Numero() == numero) {
					ha.establecer_Ocupada(true);
					System.out.println("Reserva hecha con éxito");
					break;
				}
			}
		} else {
			System.out.println("No se puede hacer la reserva");
		}
	}

	//método para cancelar la reserva
	public void cancelar_Reserva(int numero) {
		if (!verificar_Disponibilidad(numero)) {
			for (habitacion h : habitaciones) {
				if (h.dime_Numero() == numero) {
					h.establecer_Ocupada(false);
					System.out.println("Reserva cancelada");
					break;
				}
			}
		} else {
			System.out.println("La habitación no está reservada");
		}

	}

	//método para verificar la disponibilidad
	public boolean verificar_Disponibilidad(int numero) {
		for (habitacion h : habitaciones) {
			if (h.dime_Numero() == numero) {
				return !h.dime_Ocupada();
			}
		}
		System.out.println("No existe la habitación");
		return false;
	}

}