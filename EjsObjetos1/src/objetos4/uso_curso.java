

package objetos4;
import javax.swing.JOptionPane;
public class uso_curso {
	public static void main(String[] args) {
		
		//instanciar la clase
		curso calificacionCurso= new curso();
		
		//introducir el nombre del curso y la calificación
		calificacionCurso.setNombre(JOptionPane.showInputDialog("Introduce el nombre del curso"));	
		calificacionCurso.setCalificacion(Integer.parseInt(JOptionPane.showInputDialog("Introduce la calificación")));	
		
		//mostrar la información del curso, calificación y categoría
		 JOptionPane.showMessageDialog(null, "Curso: " + calificacionCurso.getNombre()
		 +"\nCalificación: " + calificacionCurso.getCalificacion() +"\nCategoría: " + calificacionCurso.categorizarCalificacion());
	
	}
}
