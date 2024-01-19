package objetos3;
public class uso_receta {
	public static void main(String[] args) {
		
		receta tortillaReceta = new receta("Tortilla de patata"); //instanciar la clase receta
		//añadir e imprimir los ingredientes
		tortillaReceta.añadirIngrediente("Patatas");
		tortillaReceta.añadirIngrediente("Huevos");
		tortillaReceta.añadirIngrediente("Cebolla");
		tortillaReceta.añadirIngrediente("Sal");
		//añadir e imprimir los pasos
		tortillaReceta.añadirPaso("Pelar y cortar las patatas y la cebolla");
		tortillaReceta.añadirPaso("Freir en una sartén con aceite las patatas y la cebolla");
		tortillaReceta.añadirPaso("Batir los huevos con un poco de sal");
		tortillaReceta.añadirPaso("Añadir la mezcla de patatas y cebolla y echarla en la sartén");
		tortillaReceta.añadirPaso("Freir por los dos lados dándole la vuelta y retirar del fuego");
		//mostrar la receta
		tortillaReceta.mostrarReceta();
	    }
	}
