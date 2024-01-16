package objetos2;

public class uso_producto {

	public static void main(String[] args) {
		
		producto ordenador = new producto();
		ordenador.establece_nombre();
		System.out.println(ordenador.dime_nombre());
		
		ordenador.establece_precio();
		System.out.println(ordenador.dime_precio());
		
		ordenador.establece_stock();
		System.out.println(ordenador.dime_stock());

	}

}
