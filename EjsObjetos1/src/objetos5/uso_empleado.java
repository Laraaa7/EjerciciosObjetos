package objetos5;

public class uso_empleado {

	public static void main(String[] args) {
		
		 System.out.println("EMPLEADO 1");
		 System.out.println();
		 empleado Empleado1 = new empleado("Lara", 3000.0, 2022, 1, 1);
		 System.out.println("Nombre: " + Empleado1.dameNombre());
	     System.out.println("Sueldo: " + Empleado1.dameSueldo()+ "€");
	     System.out.println("Fecha de Contrato: " + Empleado1.dameFechaContrato().getTime());
	     	     
	     
	}
}