import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    //Persona pp = new Persona("pp","grande", LocalDateTime.now(),"7324234342X");

    Alumno a = new Alumno("JJ","Jameson", LocalDateTime.now(),"7324234342NY","EXP001J", "DAW","1");
    Delegado d = new Delegado("Peter","Parker", LocalDateTime.now(),"7324234342SP","EXP001SP", "DAW","2");
    Persona jj = a;
    Persona pp = d;

    Profesor otto = new Profesor("Otto","Octavio", LocalDateTime.now(),"7324234342OTT");


    Persona [] miCentroEd = new Persona[5];

    miCentroEd[0] = pp;
    miCentroEd[1] = a;
    miCentroEd[2] = jj;
    miCentroEd[3] = d;
    miCentroEd[4] = otto;

    for (Persona p : miCentroEd) {
        System.out.println(p);
    }



    }
}