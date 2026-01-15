import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main2 {
    public static void main(String[] args) {

        Map<String, Persona> alumnos = new TreeMap<>(); //new HashMap<>();

        Persona a1 = new Persona("1000X", "Oscar", "Lanza");
        Persona a2 = new Persona("1001X", "Aaron", "Lanza");
        Persona a3 = new Persona("1002X", "Joaquin", "Lanza");
        Persona a4 = new Persona("1003X", "Mario", "Lanza");
        Persona a5 = new Persona("1004X", "Diego", "Lanza");
        Persona aRepe = new Persona("1000X", "No soy Oscar", "Lanza");

        alumnos.put(a1.getDni(), a1);
        alumnos.put(a2.getDni(), a2);
        alumnos.put(a3.getDni(), a3);
        alumnos.put(a4.getDni(), a4);
        alumnos.put(a5.getDni(), a5);

        alumnos.put(aRepe.getDni(), aRepe);

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el dni del alumno: ");
        String dni = sc.nextLine();
        System.out.println("Introduce el nombre del alumno: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce el apellido del alumno: ");
        String apellido = sc.nextLine();

        alumnos.put(dni, new Persona(dni, nombre, apellido));

        alumnos.containsKey(dni);
        System.out.println("\n");
        for (Map.Entry<String, Persona> entry : alumnos.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().toString());
        }

        System.out.println("\n");
        for(String clave : alumnos.keySet()) {
            System.out.println("Clave: " + clave + " Valor: " + alumnos.get(clave).toString());
        }

        System.out.println("\n");
        for (Persona p : alumnos.values()) {
            System.out.println(p.toString());
        }


    }
}
