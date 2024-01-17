package objetos2;
public class uso_estudiante {
	public static void main(String[] args) {
		
		estudiante estudianteLara = new estudiante(); //instancia la clase estudiante y la asigna a estudianteLara
		estudianteLara.establece_nombre(); //llama al setter
		System.out.println(estudianteLara.dime_nombre()); //llama al guetter e imprime el nombre
		
		estudianteLara.establece_edad(); //llama la setter
		System.out.println(estudianteLara.dime_edad()); //llama la guetter e imprime la edad
		
		estudianteLara.establece_calificacion(); //llama al setter
		System.out.println(estudianteLara.dime_calificacion()); //llama al guetter e imprime la edad
	}
}
