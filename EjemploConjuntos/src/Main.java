import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Set<String> personas = new HashSet<String>();

        personas.add("John");
        personas.add("Jane");
        personas.add("Julie");
        personas.add("Albert");
        personas.add("Robert");
        personas.add("Julie");

        for (String persona : personas) {
            System.out.println(persona);
        }

        //Conjunto de Personas
        Set<Persona> people = new HashSet<>();
        people.add(new Persona("2000X","John","Doe"));
        people.add(new Persona("20004X","Jane","Doe"));
        people.add(new Persona("20099X","Julie","Doe"));
        people.add(new Persona("20001X","Albert","Doe"));
        people.add(new Persona("2000X","John","Doe"));

        for (Persona persona : people) {
            System.out.println(persona);
        }

        //Empieza el ejemplo de TreeSet
        System.out.println("\n\nEMPIEZA EL EJEMPLO DE TREESET");

        Set<String> personasOrdenadas = new TreeSet<>();

        personasOrdenadas.add("John");
        personasOrdenadas.add("Jane");
        personasOrdenadas.add("Julie");
        personasOrdenadas.add("Albert");
        personasOrdenadas.add("Robert");
        personasOrdenadas.add("Julie");
        personasOrdenadas.add("Albert");

        for (String persona : personasOrdenadas) {
            System.out.println(persona);
        }

        Set<Persona> peopleSorted = new TreeSet<>();

        peopleSorted.add(new Persona("20000X","John","Doe"));
        peopleSorted.add(new Persona("20004X","Jane","Doe"));
        peopleSorted.add(new Persona("20099X","Julie","Doe"));
        peopleSorted.add(new Persona("20001X","Albert","Doe"));
        peopleSorted.add(new Persona("20000X","John","Doe"));

        for (Persona persona : peopleSorted) {
            System.out.println(persona);
        }

    }
}