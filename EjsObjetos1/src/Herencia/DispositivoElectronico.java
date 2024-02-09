package Herencia;

public class DispositivoElectronico {

	//variables
	private String fabricante;
	private int añoDeFabricacion;
	
	//constructor
	public DispositivoElectronico(String fabricante, int añoDeFabricacion) {
		this.fabricante=fabricante;
		this.añoDeFabricacion=añoDeFabricacion;
	}
	
	//getters
	public String getFabricante() {
        return fabricante;
    }

    public int getAñoDeFabricacion() {
        return añoDeFabricacion;
    }
}
