import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Representa a una persona con información básica de identificación y nacimiento.
 * <p>
 * Esta clase permite gestionar los datos personales y obtener la fecha de
 * nacimiento en formatos específicos.
 * </p>
 * * @author Anuar
 * @version 1.0
 */
public class Persona {

    private String nombre;
    private String dni;
    private LocalDate fechaNacimiento;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    /**
     * Constructor principal para crear una nueva instancia de Persona.
     * * @param nombre           El nombre completo de la persona.
     * @param dni              El identificador legal (DNI).
     * @param fechaNacimiento  La fecha de nacimiento en formato {@link LocalDate}.
     */
    public Persona(String nombre, String dni, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Obtiene el nombre de la persona.
     * @return Un {@code String} con el nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el DNI de la persona.
     * @return Un {@code String} con el DNI.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Obtiene la fecha de nacimiento original.
     * @return Objeto {@link LocalDate} con la fecha.
     */
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Devuelve la fecha de nacimiento formateada según el patrón "dd/MM/yyyy".
     * * @return La fecha de nacimiento como una cadena de texto formateada.
     */
    public String getFechaNacimientoFormato(){
        return this.fechaNacimiento.format(formatter);
    }

    /**
     * Crea una representación en cadena de texto de los datos de la persona.
     * * @return Un {@code String} detallando los atributos de la instancia.
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", dni='").append(dni).append('\'');
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append('}');
        return sb.toString();
    }
}
