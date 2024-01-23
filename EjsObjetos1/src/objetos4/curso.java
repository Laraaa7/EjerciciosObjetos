package objetos4;
public class curso {
	
	//atributos
	private String nombre;
	private int calificacion;
	
	//constructor
	public curso() {
		this.nombre=nombre;
		this.calificacion=calificacion;
	}
	
	//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	//método para calificar por letras
	 public String categorizarCalificacion() {
			switch (calificacion) {
			case 100:
			case 90:
	            return "A";
	        case 80:
	            return "B";
	        case 70:
	            return "C";
	        case 60:
	            return "D";
	        default:
	            return "F";
	    }
	}
	}
