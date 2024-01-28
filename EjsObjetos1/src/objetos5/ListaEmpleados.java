package objetos5;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ListaEmpleados {

	public static void main(String[] args) {
		
		ArrayList<empleado> listaEmpleados = new ArrayList<>();

	        for (int i = 1; i <= 3; i++) {
	            String nombre = JOptionPane.showInputDialog("Introduce el nombre del empleado " + i);
	            double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Introduce el sueldo de " + nombre));
	            int año = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año de contratación de " + nombre));
	            int mes = Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes de contratación de " + nombre));
	            int dia = Integer.parseInt(JOptionPane.showInputDialog("Introduce el día de contratación de " + nombre));
	            listaEmpleados.add(new empleado(nombre, sueldo, año, mes, dia));
	        }
			
	        String resumen = "LISTA DE 3 EMPLEADOS\n\n";
	        int contador = 1;
	        for (empleado Empleados : listaEmpleados) {
	        	resumen += "Empleado " + contador + "\n";
	        	resumen += "Nombre: " + Empleados.dameNombre() + "\n";
	        	resumen += "Sueldo: " + Empleados.dameSueldo() + "€\n";
	        	resumen += "Fecha de Contrato: " + Empleados.dameFechaContrato().getTime() + "\n\n";
	            contador++;
	        }
	        JOptionPane.showMessageDialog(null, resumen);
	    }
	}
