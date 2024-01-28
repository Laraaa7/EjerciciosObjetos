package objetos5;

public class comparacionFechasContrato {

	public static void main(String[] args) {
		
		 System.out.println("EMPLEADO 3");
		 System.out.println();
	     empleado Empleado3 = new empleado("Sara", 2000.0, 2020, 3, 3);
	     System.out.println("Nombre: " + Empleado3.dameNombre());
	     System.out.println("Sueldo: " + Empleado3.dameSueldo()+ "€");
	     System.out.println("Fecha de Contrato: " + Empleado3.dameFechaContrato().getTime());
	     System.out.println("-------------------------------");
	     
	     System.out.println("EMPLEADO 4");
	     System.out.println();
	     empleado Empleado4 = new empleado("David", 3000.0, 2019, 4,4);
	     System.out.println("Nombre: " + Empleado4.dameNombre());
	     System.out.println("Sueldo: " + Empleado4.dameSueldo()+ "€");
	     System.out.println("Fecha de Contrato: " + Empleado4.dameFechaContrato().getTime());
	     System.out.println("-------------------------------");
	     
	     if (Empleado3.dameFechaContrato().before(Empleado4.dameFechaContrato())) {
	            System.out.println("El empleado 3 fue contratado primero");
	        } else if (Empleado4.dameFechaContrato().before(Empleado3.dameFechaContrato())){
	            System.out.println("El empleado 4 fue contratado primero");
	        }else{
	        	System.out.println("Los dos empleados fueron contratados al mismo tiempo");
	        }
	}

}
