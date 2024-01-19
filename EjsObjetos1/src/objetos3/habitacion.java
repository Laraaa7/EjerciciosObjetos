package objetos3;

public class habitacion {

	private int numero;
	private String tipo;
	private boolean ocupada;

	// constructor
	public habitacion(int numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
		this.ocupada = false;
	}

	// Getters y Setters
	public int dime_Numero() { //getter
		return numero;
	}

	public String dime_Tipo() { //getter
		return tipo;
	}
	public void establecer_Tipo(String tipo) { //setter
		if (tipo.equalsIgnoreCase("simple") || tipo.equalsIgnoreCase("doble") || tipo.equalsIgnoreCase("suite")) {
			this.tipo = tipo;
		}else {
			System.out.println("La habitación solo puede ser de tipo simple, doble o suite");
		}
	}
	public boolean dime_Ocupada() { //getter
		return ocupada;
	}
	public void establecer_Ocupada(boolean ocupada) { //setter
		this.ocupada = ocupada;
	}
	public void establecer_Numero(int numeroHab) { //setter
		if (numeroHab < 1) {
			System.out.println("El número de habitación tiene que ser mayor a cero");
		}else {
			this.numero = numeroHab;
		}
	}


	}



	 
