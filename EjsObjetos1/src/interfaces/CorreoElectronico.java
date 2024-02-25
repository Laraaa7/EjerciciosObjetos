package interfaces;

public class CorreoElectronico implements Notificable {

	//implementar método para correo electrónico
	@Override
	public void enviarNotificacion() {
		System.out.println("Notificación enviada por correo electrónico");
	    }
	}

