import java.time.LocalDateTime;
import java.util.Arrays;

public class Alumno extends Persona {
    private String nExpediente;
    private String ciclo;
    private String curso;
    private Notas[] notas;



    public Alumno(String nombre, String apellido, LocalDateTime fecha_nacimiento, String dni,
                  String nExpediente, String ciclo, String curso) {
        super(nombre, apellido, fecha_nacimiento, dni);
        this.nExpediente = nExpediente;
        this.ciclo = ciclo;
        this.curso = curso;
    }

    @Override
    public String reunirme(){
        return "Me reuno con mis compañeros de clase";
    }

    @Override
    public String morir() {
        return "Los examenes de programacion me matan";
    }

    @Override
    public String toString() {

        return super.toString() + "Alumno{" +
                "nExpediente='" + nExpediente + '\'' +
                ", ciclo='" + ciclo + '\'' +
                ", curso='" + curso + '\'' +
                ", notas=" + Arrays.toString(notas) +
                "} \n";

    }

    public String mostrarNotas(){
        String notasString = "";
        for(int i = 0; i < notas.length; i++){
            notasString = notasString + notas[i].toString();
        }
        return notasString;
    }

    public String mostrarNotas(String curso){
        String notasString = "";
        for(int i = 0; i < notas.length; i++){
            if(notas[i].getCurso().equals(curso)){
                notasString = notasString + notas[i].toString() + ",";
            }

        }
        return notasString;
    }
}
