package interfaces;

class Aplicacion implements Notificable {
  
   //implementar método para aplicación
   @Override
   public void enviarNotificacion() {
      System.out.println("Notificación enviada por la aplicación");
   }
}
