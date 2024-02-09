package Herencia;

import javax.swing.JOptionPane;

public class Uso_PersonaEstudiante {
	
	public static void main(String[] args) {
		
		//introducir datos
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
		String carrera = JOptionPane.showInputDialog("Introduce la carrera que estás realizando");

		Estudiante estudiante = new Estudiante (nombre, edad,carrera);

		//mostrar datos
		JOptionPane.showMessageDialog(null,
				"\nNombre: " + estudiante.getNombre() +
				"\nEdad: " + estudiante.getEdad() +
				"\nCarrera: " + estudiante.getCarrera());
	}

}
	
