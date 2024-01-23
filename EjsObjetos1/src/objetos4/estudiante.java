package objetos4;

import javax.swing.JOptionPane;

public class estudiante {
	//atributos
	private String nombre, grado;
	private int edad;
//constructor
public estudiante() {
	this.nombre=nombre;
	this.edad=edad;
	this.grado=grado;
	}
//getters y setters
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public String getGrado() {
	return grado;
}
public void setGrado(String grado) {
	this.grado = grado;
	
}

//método para mostrar informacion
public void mostrarInformacion() {
	JOptionPane.showMessageDialog(null, "Nombre: "+nombre+"\nEdad: "+edad+"\nGrado: "+grado);
}
}
