package objetos4;
import javax.swing.JOptionPane;
public class uso_estudiante {
	public static void main(String[] args) {
		
		//estudiante 1
		estudiante estudiante1 = new estudiante();
		System.out.println("ESTUDIANTE 1");
		estudiante1.setNombre(JOptionPane.showInputDialog("Introduce el nombre del estudiante 1"));	
		System.out.println("Nombre: " + estudiante1.getNombre());
		
		estudiante1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del estudiante 1")));	
		System.out.println("Edad: " + estudiante1.getEdad());
	
		estudiante1.setGrado(JOptionPane.showInputDialog("Introduce el grado del estudiante 1"));	
		System.out.println("Grado: " + estudiante1.getGrado());
		System.out.println();
		
		//estudiante 2
		estudiante estudiante2 = new estudiante();
		
		System.out.println("ESTUDIANTE 2");
		estudiante2.setNombre(JOptionPane.showInputDialog("Introduce el nombre del estudiante 2"));	
		System.out.println("Nombre: " + estudiante2.getNombre());
		
		estudiante2.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del estudiante 2")));
		System.out.println("Edad: " + estudiante2.getEdad());
		
		estudiante2.setGrado(JOptionPane.showInputDialog("Introduce el grado del estudiante 2"));	
		System.out.println("Grado: " + estudiante2.getGrado());
		System.out.println();
		
		//estudiante3
		estudiante estudiante3 = new estudiante();
		
		System.out.println("ESTUDIANTE 3");
		estudiante3.setNombre(JOptionPane.showInputDialog("Introduce el nombre del estudiante 3"));	
		System.out.println("Nombre: " + estudiante3.getNombre());
		
		estudiante3.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del estudiante 3")));	
		System.out.println("Edad: " + estudiante3.getEdad());
		
		estudiante3.setGrado(JOptionPane.showInputDialog("Introduce el grado del estudiante 3"));	
		System.out.println("Grado: " + estudiante3.getGrado());
		
		//mostrar los datos de los estudiantes
		estudiante1.mostrarInformacion();
		estudiante2.mostrarInformacion();
		estudiante3.mostrarInformacion();
	}
}
