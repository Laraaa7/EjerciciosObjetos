package objetos3;

public class uso_relojAlarma {

    public static void main(String[] args) {

    	relojAlarma Alarma = new relojAlarma();
    	System.out.println(Alarma.dime_horaAlarma());
    	System.out.println(Alarma.dime_horaActual());
    	 Alarma.establece_alarmaActivada(true);
    	 Alarma.compruebaAlarma();
    }
}
