public class Notas {
    private String asignatura;
    private double nota;
    private String curso;

    public Notas(String asignatura, double nota, String curso) {
        this.asignatura = asignatura;
        this.nota = nota;
        this.curso = curso;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Notas{" +
                "asignatura='" + asignatura + '\'' +
                ", nota=" + nota +
                ", curso='" + curso + '\'' +
                '}';
    }
}
