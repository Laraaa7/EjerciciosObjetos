package objetos5;

import javax.swing.JOptionPane;

public class modificacionSueldo {

	public static void main(String[] args) {
		 
		System.out.println("EMPLEADO 2");
		 System.out.println();
	     empleado Empleado2 = new empleado("Pepe", 4000.0, 2021, 2, 2);
	     System.out.println("Nombre: " + Empleado2.dameNombre());
	     System.out.println("Fecha de Contrato: " + Empleado2.dameFechaContrato().getTime());
	     System.out.println("Sueldo antes del aumento: " + Empleado2.dameSueldo()+ "€");
	     //aumentar el sueldo un 10%
	     Empleado2.subeSueldo(10.0);
	     System.out.println("Sueldo después del aumento: " + Empleado2.dameSueldo()+ "€");
	     JOptionPane.showMessageDialog(null, "Sueldo después del aumento: " + Empleado2.dameSueldo()+ "€");     
	}

}
