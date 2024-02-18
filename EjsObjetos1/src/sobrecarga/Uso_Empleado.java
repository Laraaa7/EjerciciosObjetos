package sobrecarga;

public class Uso_Empleado {
	
	public static void main(String[] args) {
		
	   //instanciar
	   Empleado empleado1 = new Empleado("Pepe", 1000, "RRHH");
       Empleado empleado2 = new Empleado("Pepa", 1200);
       Empleado empleado3 = new Empleado();
      
       //imprimir informacion
       System.out.println("-Empleado 1-");
       empleado1.mostrarInfo();
       System.out.println("-Empleado 2-");
       empleado2.mostrarInfo();
       System.out.println("-Empleado 3-");
       empleado3.mostrarInfo();
	}
}
