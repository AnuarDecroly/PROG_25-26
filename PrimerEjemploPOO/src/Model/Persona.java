package Model;

public class Persona {

    //Atributos todos se ponen private
    private String nombre;
    private String apellido;
    private int edad;
    private String dni;
    private String genero;
    private String telefono;
    private String email;

    //constructor
    public Persona(String nombre, String apellido, int edad, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;

        this.genero = "VARON";
        this.telefono = "0";
        this.email = "";
    }

    public Persona(String dni){
        this.dni = dni;
    }

    public Persona(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    public Persona() {}

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    public void cumplirEdad() {
        this.edad++;
    }

    public void setEdad(int edad) {
        if( edad > 0){
            this.edad = edad;
        }
    }

    public String getDni() {
        return this.dni;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String mostrarInfoPersona() {
        String info = "";
        info = "Nombre: " + this.nombre + "\nApellido: " + this.apellido + "\nEdad: " + this.edad
                + "\nDni: " + this.dni + "\nGenero: " + this.genero + "\nTelefono: " + this.telefono +
                "\nEmail: " + this.email;
        return info;
    }




}
