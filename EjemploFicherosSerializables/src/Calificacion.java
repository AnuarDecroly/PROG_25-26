import java.io.Serial;
import java.io.Serializable;

public class Calificacion implements Serializable{

    @Serial
    private static final long serialVersionUID = 8781663231020210443L;

    private String asignatura;
    private int nota;

    public Calificacion(String asignatura, int nota) {
        this.asignatura = asignatura;
        this.nota = nota;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Calificacion{");
        sb.append("asignatura='").append(asignatura).append('\'');
        sb.append(", nota=").append(nota);
        sb.append('}');
        return sb.toString();
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getAsignatura() {
        return asignatura;
    }

}
