package objetos2;

public class uso_estudiante {

	public static void main(String[] args) {
		
		estudiante estudianteLara = new estudiante();
		estudianteLara.establece_nombre();
		System.out.println(estudianteLara.dime_nombre());
		
		estudianteLara.establece_edad();
		System.out.println(estudianteLara.dime_edad());
		
		estudianteLara.establece_calificacion();
		System.out.println(estudianteLara.dime_calificacion());

	}

}
