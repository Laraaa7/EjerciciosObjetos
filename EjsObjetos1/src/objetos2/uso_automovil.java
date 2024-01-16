package objetos2;
public class uso_automovil {

	public static void main(String[] args) {
		
		automovil Tesla = new automovil();
		Tesla.establece_marca();
		System.out.println(Tesla.dime_marca());
		
		Tesla.establece_modelo();
		System.out.println(Tesla.dime_modelo());
	}

}
