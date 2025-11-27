import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Persona {

    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String direccion;
    private String dni;
    private LocalDateTime fecha_nacimiento;

    public Persona(String nombre, String apellido, LocalDateTime fecha_nacimiento, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.dni = dni;
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDni() {
        return dni;
    }

    public LocalDateTime getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;

    }

    public abstract String reunirme();

    public abstract String morir();

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + this.nombre + '\'' +
                ", apellido='" + this.apellido + '\'' +
                ", email='" + this.email + '\'' +
                ", telefono='" + this.telefono + '\'' +
                ", direccion='" + this.direccion + '\'' +
                ", dni='" + this.dni + '\'' +
                ", fecha_nacimiento=" + this.fecha_nacimiento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) && Objects.equals(apellido, persona.apellido) && Objects.equals(dni, persona.dni) && Objects.equals(fecha_nacimiento, persona.fecha_nacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, dni, fecha_nacimiento);
    }
}
