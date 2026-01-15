import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //el primero es la clave y el segundo el valor
        Map<String, String> alumnos = new HashMap<>();

        alumnos.put("720000X", "Oscar Lanza");
        alumnos.put("720001X", "Aaron");
        alumnos.put("720002X", "Joaquin");
        alumnos.put("720003X", "Mario");
        alumnos.put("720004X", "Diego");
        alumnos.put("720000X", "No soy Oscar Lanza");

        //Nos devuelve un boolean para decirno si esta o no la clave
        alumnos.containsKey("720000X");

        //Nos devuelve el valor de esa clave
        String alumno = alumnos.get("720000X");

        System.out.println("Soy el alumno modificado:" +alumno);

        //Eliminar la dupla de clave-valor
        alumnos.remove("720000X");

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el alumno: ");
        String alumno2 = sc.nextLine();
        System.out.println("Introduce el dni: ");
        String dni2 = sc.nextLine();

        if(!alumnos.containsKey(dni2)) {
            alumnos.put(dni2, alumno2);
        }
        else{
            System.out.println("El dni ya existe");
        }

        System.out.println("Hay " +alumnos.size() +" elementos en el mapa");

        for(Map.Entry<String, String> entry : alumnos.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\n Iterando solo por el conjunto de claves");
        for(String clave : alumnos.keySet()){
            System.out.println(clave + ": " + alumnos.get(clave));
        }

        System.out.println("\n Iterando los valores");
        for(String valor : alumnos.values()){
            System.out.println("Valor: " + valor);

        }




    }
}