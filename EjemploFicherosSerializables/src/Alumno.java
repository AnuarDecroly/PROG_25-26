import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Alumno implements Serializable {

    @Serial
    private static final long serialVersionUID = -4316273174281088381L;

    String nombre;
    String apellido;
    String email;
    int edad;

    private List<Calificacion> calificaciones;

    public Alumno(String nombre, int edad, String apellido, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
        this.email = email;
        this.calificaciones = new LinkedList<>();
    }

    public void calificar(String asignatura, int nota) {
        this.calificaciones.add(new Calificacion(asignatura, nota));
    }

    public List<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Alumno{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", edad=").append(edad);
        sb.append('}');
        return sb.toString();
    }
}
