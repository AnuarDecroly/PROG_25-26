import java.util.Objects;

public class Persona implements Comparable<Persona>{

    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    public Persona(String dni, String nombre, String apellido, String telefono, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }

    public Persona(String dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = "";
        this.email = "";
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("dni ='").append(dni).append('\'');
        sb.append(", nombre ='").append(nombre).append('\'');
        sb.append(", apellido ='").append(apellido).append('\'');
        sb.append(", telefono ='").append(telefono).append('\'');
        sb.append(", email ='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni) && Objects.equals(nombre, persona.nombre) && Objects.equals(apellido, persona.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, nombre, apellido);
    }

    @Override
    public int compareTo(Persona o) {
        if(o != null){
            return this.dni.compareTo(o.dni);
        }
        return 1;
    }
}
