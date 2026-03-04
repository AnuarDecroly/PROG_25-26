import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneOffset;

public class Cliente extends Persona implements Serializable {

    private static final long serialVersionUID = 4737651236172682135L;

    private String telefono;
    private String direccion;
    private String email;

    public Cliente(String nombre, String dni, LocalDate fechaNacimiento,
                   String telefono, String direccion, String email) {
        super(nombre, dni, fechaNacimiento);
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;

    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cliente{");
        sb.append("nombre='").append(this.getNombre()).append('\'');
        sb.append("dni='").append(this.getDni()).append('\'');
        sb.append("fecha nacimiento='").append(this.getFechaNacimientoFormato()).append('\'');
        sb.append("telefono='").append(telefono).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
