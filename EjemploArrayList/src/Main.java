import java.util.*;

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
        personas.add(new Persona("20003X", "Paco", "Garcia"));
        personas.add(new Persona("20006X", "Roberto", "Lopez"));
        personas.add(new Persona("20067X", "Fran", "Martinez"));
        Collections.sort(personas);

        System.out.println("Lista ordenada de personas por NOMBRE");
        for(Persona p : personas){
            System.out.println(p);
        }


        System.out.println("\n");
        int index = -1;
        for(Persona p : personas){
            System.out.println(p);
            if(p.getDni().equals(p1.getDni())){
                index = personas.indexOf(p);
                break;
            }

        }
        personas.remove(index);


        System.out.println("\n AQUI EMPIEZA LINKEDLIST");

        LinkedList<Persona> personasLK = new LinkedList<>();

        personasLK.add(new Persona("20001X", "Pablo", "Lopez"));
        personasLK.push(p1);
        personasLK.push(new Persona("20007X", "Carla", "Lopez"));

        for(Persona p : personasLK){
            System.out.println(p);
        }

        personasLK.pop();

        for(Persona p : personasLK){
            System.out.println(p);
        }


        Empresa e1 = new Empresa("X12345","Paseo Altaramira","Decroly");
        e1.registrarTrabajador(p1);
        e1.registrarTrabajador(new Persona("20001X", "Pablo", "Lopez"));
        e1.registrarTrabajador(new Persona("20007X", "Carla", "Lopez"));

        List<Persona> trabajadores =  e1.obtenerTrabajadoresEmpresa();

        LinkedList<Persona> list2 = new LinkedList<>(personas);
        
    }

}