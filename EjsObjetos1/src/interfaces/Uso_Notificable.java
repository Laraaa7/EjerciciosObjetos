package interfaces;

public class Uso_Notificable {
	
	public static void main(String[] args) {
		  
	//instanciar
    Notificable notificacion1 = new CorreoElectronico();
    Notificable notificacion2 = new SMS();
    Notificable notificacion3 = new Aplicacion();

    //mostrar información
    notificacion1.enviarNotificacion();
    notificacion2.enviarNotificacion();
    notificacion3.enviarNotificacion();
	  }
}