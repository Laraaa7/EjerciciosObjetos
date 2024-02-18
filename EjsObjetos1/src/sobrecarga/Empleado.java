package sobrecarga;

public class Empleado {
	
		//variables
	    private String nombre;
	    private double salario;
	    private String departamento;
	    
	    //constructor con todos los parámetros
	    public Empleado(String nombre, double salario, String departamento) {
	        this.nombre = nombre;
	        this.salario = salario;
	        this.departamento = departamento;
	    }
	    
	    //constructor con nombre y salario
	    public Empleado(String nombre, double salario) {
	    	this.nombre = nombre;
	        this.salario = salario;
	        this.departamento = "Sin departamento";
	    }
	    
	    //constructor sin parámetros
	    public Empleado() {
	    	this.nombre = "Sin nombre";
	        this.salario = 0.0;
	        this.departamento = "Sin departamento";
	    }
	    
	    //método para mostrar la información de los empleados
	    public void mostrarInfo() {
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Salario: " + salario + "€");
	        System.out.println("Departamento: " + departamento);
	        System.out.println();
	    }
	}
