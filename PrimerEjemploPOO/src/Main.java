import Model.Persona;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double[] numeros = new double[3];
        Persona pp = new Persona("Pepe", "Grande", 33, "720000000T");
        Persona p1 = new Persona("1300000X");

        p1 = pp;

        System.out.println("\nMostrar informacion completa de una persona P1");
        System.out.println(p1.mostrarInfoPersona());





        pp.setEmail("pphone@email.com");
        pp.setTelefono("942000000");


        System.out.println("Nombre: " + pp.getNombre());
        System.out.println("DNI: " + pp.getDni());
        System.out.println("Telefono: " + pp.getTelefono());
        System.out.println("Email: " + pp.getEmail());
        System.out.println("Edad: " + pp.getEdad());

        System.out.println("\nHoy es el cumpleaños de Pepe");
        pp.cumplirEdad();
        System.out.println("Edad: " + pp.getEdad());

        System.out.println("\nMostrar informacion completa de una persona");
        System.out.println(pp.mostrarInfoPersona());

        System.out.println("\nMostrar informacion completa de una persona P1  DESPUES DE TODO");
        System.out.println(p1.mostrarInfoPersona());
    }
}