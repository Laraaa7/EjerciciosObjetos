package interfaces;

public class SMS implements Notificable {
   
   //implementar método para SMS
   @Override
   public void enviarNotificacion() {
      System.out.println("Notificación enviada por SMS");
   }
}

