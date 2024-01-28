package objetos4;

public class contacto {
    
	//atributos
    private String nombre, telefono, email;

    //constructor
    public contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    //getters y setters  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método para mostrar información del contacto
    public String mostrarInformacion() {
        return "Nombre: " + nombre + "\nTeléfono: " + telefono + "\nEmail: " + email;
    }
}