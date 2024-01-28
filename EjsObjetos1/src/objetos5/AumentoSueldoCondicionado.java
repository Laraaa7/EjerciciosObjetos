package objetos5;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class AumentoSueldoCondicionado {

	public static void main(String[] args) {
		ArrayList<empleado> ListaEmpleados = new ArrayList<>();

		ListaEmpleados.add(new empleado("Laura", 1000.0, 2021, 5, 5));
		ListaEmpleados.add(new empleado("Carla", 2000.0, 2020, 6, 6));
		ListaEmpleados.add(new empleado("Antonio", 3000.0, 2023, 7, 7));
		ListaEmpleados.add(new empleado("Paco", 4000.0, 2018, 8, 8));
		
	    System.out.println("- SUELDO INICIAL: ");
		for (empleado Empleado : ListaEmpleados) {		 
			 System.out.println("\nNombre: " + Empleado.dameNombre());
			 System.out.println("Sueldo: " + Empleado.dameSueldo() + "€");
			 System.out.println("Fecha de Contrato: " + Empleado.dameFechaContrato().getTime());
			//si el empleado fue contratado antes del 2021 aumenta su sueldo en un 5%
			 int añoContratacion = Empleado.dameFechaContrato().get(GregorianCalendar.YEAR);
            if (añoContratacion < 2021) {
                Empleado.subeSueldo(5.0);
            }
        }
		System.out.println("------------------------");
		
		 System.out.println("- SUELDO ACTUALIZADO: ");
		for (empleado Empleado : ListaEmpleados) {
			System.out.println("\nNombre: " + Empleado.dameNombre());
			 System.out.println("Sueldo: " + Empleado.dameSueldo() + "€");
			 System.out.println("Fecha de Contrato: " + Empleado.dameFechaContrato().getTime());
		}
	}
	
}




