import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maria");
        nombres.add("Manuel");

        for(String n1 : nombres){
            System.out.println(n1);
        }

        nombres.remove("Maria");
        nombres.remove(0);

        for(String n1 : nombres){
            System.out.println(n1);
        }

        String [] misNombres = new String[10];
        misNombres[0] = "Juan";
        misNombres[1] = "Pedro";
        misNombres[2] = "Maria";
        misNombres[3] = "Manuel";

        ArrayList<Persona> personas = new ArrayList<>();
        Persona p1 = new Persona("720000X", "Pepe", "Grande");
        personas.add(p1);

        personas.add(new Persona("20000X", "Pedro", "Lopez"));

        int index = -1;
        for(Persona p : personas){
            System.out.println(p);
            if(p.getDni().equals(p1.getDni())){
                index = personas.indexOf(p);
                break;
            }

        }
        personas.remove(index);



    }
}