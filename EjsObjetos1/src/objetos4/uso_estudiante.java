package objetos4;
import javax.swing.JOptionPane;
public class uso_estudiante {
	public static void main(String[] args) {
		
		//estudiante 1
		estudiante estudiante1 = new estudiante();
		
		estudiante1.setNombre(JOptionPane.
				showInputDialog("Introduce el nombre del estudiante 1"));	
		System.out.println(estudiante1.getNombre());
		
		estudiante1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del estudiante 1")));	
		System.out.println(estudiante1.getEdad());
	
		estudiante1.setGrado(JOptionPane.showInputDialog("Introduce el grado del estudiante 1"));	
		System.out.println(estudiante1.getGrado());
		
		//estudiante 2
		estudiante estudiante2 = new estudiante();
		
		estudiante2.setNombre(JOptionPane.showInputDialog("Introduce el nombre del estudiante 2"));	
		System.out.println(estudiante2.getNombre());
		
		estudiante2.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del estudiante 2")));
		System.out.println(estudiante2.getEdad());
		
		estudiante2.setGrado(JOptionPane.showInputDialog("Introduce el grado del estudiante 2"));	
		System.out.println(estudiante2.getGrado());
		
		//estudiante3
		estudiante estudiante3 = new estudiante();
		
		estudiante3.setNombre(JOptionPane.showInputDialog("Introduce el nombre del estudiante 3"));	
		System.out.println(estudiante3.getNombre());
		
		estudiante3.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del estudiante 3")));	
		System.out.println(estudiante3.getEdad());
		
		estudiante3.setGrado(JOptionPane.showInputDialog("Introduce el grado del estudiante 3"));	
		System.out.println(estudiante3.getGrado());
		
		//mostrar los datos de estudiantes
		estudiante1.mostrarInformacion();
		estudiante2.mostrarInformacion();
		estudiante3.mostrarInformacion();
	}
}
