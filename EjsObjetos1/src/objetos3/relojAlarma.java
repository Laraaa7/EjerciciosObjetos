package objetos3;
public class relojAlarma {
    
	private String horaAlarma, horaActual;
    private boolean alarmaActivada;
    
    public relojAlarma() {
    	this.horaAlarma="20:00";
    	this.horaActual="20:00";
    	this.alarmaActivada=false;
    }
   public String dime_horaAlarma() { //getter
	   return "La hora de la alarma es " + horaAlarma;
   }
	public void establece_horaAlarma (String horaAlarma) { //setter
	 this.horaAlarma=horaAlarma;
	}
	public String dime_horaActual(){ //getter
		return "La hora actual es " + horaActual;
	}
	public void establece_horaActual (String horaActual) { //setter
		this.horaActual=horaActual;
	}
	public void establece_alarmaActivada(boolean alarmaActivada) { //setter
		this.alarmaActivada=alarmaActivada;
	}
	public void compruebaAlarma() {
		if (alarmaActivada && horaActual.equals(horaAlarma)) {
			System.out.println("La alarma está sonando");
		}else {
			System.out.println("La alarma no está sonando");
		}
	}
}