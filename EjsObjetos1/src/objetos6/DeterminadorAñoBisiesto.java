package objetos6;

public class DeterminadorAñoBisiesto {
	
	//variables y constantes
	private int año;
	private final int divisiblePor4 = 4;
    private final int divisiblePor100 = 100;
    private final int divisiblePor400 = 400;

    //constructor
	public DeterminadorAñoBisiesto() {
		this.año = año;
	}
	
	//setter
	public void establecerAño(int año) {
		this.año = año;
	}

	//método para determinar si un año es bisiesto
	public String determinarBisiesto() {
		if ((año%divisiblePor4==0 && año%divisiblePor100!=0)||(año%divisiblePor400==0)) {
			return año + " es bisiesto";
		}else {
			return año + " no es bisiesto";
		}
	}
}
