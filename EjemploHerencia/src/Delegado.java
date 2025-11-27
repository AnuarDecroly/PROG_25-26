import java.time.LocalDateTime;

public class Delegado extends Alumno{



    public Delegado(String nombre, String apellido, LocalDateTime fecha_nacimiento, String dni, String nExpediente, String ciclo, String curso) {
        super(nombre, apellido, fecha_nacimiento, dni, nExpediente, ciclo, curso);
    }

    @Override
    public String reunirme() {
        return "Me reuno con los otros delegados de las clases";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
