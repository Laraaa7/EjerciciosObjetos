package objetos4;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class uso_contacto {
    public static void main(String[] args) {
       
    	ArrayList<contacto> listaContactos = new ArrayList<>();

        int opcion;
		do {
			//menú de opciones
    		opcion = Integer.parseInt(JOptionPane.showInputDialog("Agenda de contactos\n"
    				+ "1) Para añadir contacto\n"
    				+ "2) Para buscar contacto\n"
    				+ "3) Para mostrar contactos\n"
    				+ "4) Para salir\n"
    				+ "Elige una opción:"));
    		
    		//seleccionar opción del menú
            switch (opcion) {
                case 1:
                    añadirContacto(listaContactos);
                    break;
                case 2:
                    buscarContacto(listaContactos);
                    break;
                case 3:
                    mostrarContactos(listaContactos);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo de la agenda");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (opcion != 4);
    }

    //método para añadir un nuevo contacto a la lista
    public static void añadirContacto(ArrayList<contacto> listaContactos) {
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del contacto");
        String telefono = JOptionPane.showInputDialog("Introduce el teléfono del contacto");
        String email = JOptionPane.showInputDialog("Introduce el email del contacto");

        //crear un nuevo objeto contacto y añadirlo a la lista
        contacto nuevoContacto = new contacto(nombre, telefono, email);
        listaContactos.add(nuevoContacto);
    }

    //método para buscar un contacto en la lista
    public static void buscarContacto(ArrayList<contacto> listaContactos) {
        String buscar = JOptionPane.showInputDialog("Introduce el nombre del contacto que deseas buscar");//lo que se introduzca se almacenara en la variable buscar
        boolean encontrado = false;  
        for (contacto ContactoEnLista : listaContactos) {
            if (ContactoEnLista.getNombre().equalsIgnoreCase(buscar)) { //si el contacto de la lista es igual al contacto buscado
                JOptionPane.showMessageDialog(null, ContactoEnLista.mostrarInformacion()); //se muestra la información del contacto
                encontrado = true; //actualiza el estado 
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado el contacto");
        }
    }

    //método para mostrar todos los contactos en la lista
    public static void mostrarContactos(ArrayList<contacto> listaContactos) {
        String listaCompleta = "Lista de contactos\n\n"; //almacena la información de todos los contactos en la lista
        for (contacto ContactoEnLista : listaContactos) {
        	listaCompleta += ContactoEnLista.mostrarInformacion() + "\n\n"; //concatena la informacion de los contactos a la lista completa donde se van a mostrar
        }
        JOptionPane.showMessageDialog(null, listaCompleta);
    }
}
