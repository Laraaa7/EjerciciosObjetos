package objetos4;
import javax.swing.JOptionPane;
public class uso_empleado {
	public static void main(String[] args) {
		
		//declarar array
		empleado[] empleados = new empleado[5];
		
		//bucle for para introducir los datos
		 for (int i = 0; i < empleados.length; i++) {
	            empleado empleado = new empleado();
	           
	            //introducir el nombre del empleado
	            empleado.setNombre(JOptionPane.showInputDialog("Introduce el nombre del empleado " + (i + 1) + ":"));
	           
	            //introducir las horas trabajadas
	            empleado.setHoras(Integer.parseInt(JOptionPane.showInputDialog("Introduce las horas trabajadas por el empleado " + (i + 1) + ":")));
	           
	            //introducir la tarifa por hora
	            empleado.setTarifa(Double.parseDouble(JOptionPane.showInputDialog("Introduce la tarifa por hora del empleado " + (i + 1) + ":")));
	           
	            //guardar el empleado en el array
	            empleados[i] = empleado;
	        }
	     
		 //calcular y mostrar el salario de cada empleado
		 for (int i = 0; i < empleados.length; i++) {
	            empleado empleado = empleados[i];
	            double salario = empleado.calcularSalario();
	            JOptionPane.showMessageDialog(null, "Empleado " + (i + 1) + ": " + empleado.getNombre() + "\nSalario: " + salario);
	        }
	    }
	}
