import java.time.LocalDateTime;

public class Profesor extends Persona{


    public Profesor(String nombre, String apellido, LocalDateTime fecha_nacimiento, String dni) {
        super(nombre, apellido, fecha_nacimiento, dni);
    }

    @Override
    public String reunirme() {
        return "Vaya coñazo de claustro";
    }

    @Override
    public String morir() {
        return "Estos alumnos me estan matando";
    }

    @Override
    public String toString() {
        return "Profesor{ " + super.toString() + "} \n";
    }
}
