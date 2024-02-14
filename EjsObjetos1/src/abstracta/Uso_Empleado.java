package abstracta;

public class Uso_Empleado {
	
	public static void main(String[] args) {
		
	   //instanciar
       Empleado empCompleto = new EmpleadoTiempoCompleto(3000.0);
       Empleado empParcial = new EmpleadoTiempoParcial(20.0, 15.0);
       
       //imprimir salarios
       System.out.println("El salario del empleado a tiempo completo es de " + empCompleto.calcularSalario() + "€");
       System.out.println("El salario del empleado a tiempo parcial es de " + empParcial.calcularSalario() + "€");
   }
}
