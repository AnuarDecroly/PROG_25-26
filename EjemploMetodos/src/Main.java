import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String pruebaPamarametro = "Sin el señor de los anillos no se aprueba";
        System.out.println(pruebaPamarametro);
        System.out.println(aprobar(pruebaPamarametro));
        System.out.println(pruebaPamarametro);

        saludar("Vito Corleonne");
        double resultado = suma(7, 5);

        double num1 = 23;

        double resultado2 = suma(25, 5);

        double max = maximo3(7, 13, 23);

        String opcion = "s";
        do{
            System.out.println("Escoja la opcion deseada: ");
            System.out.println("a. Sumar");
            System.out.println("B. Restar");
            System.out.println("c. Multiplicar");
            System.out.println("S. Salir");
            opcion = sc.nextLine();
            switch (opcion) {
                case "a":
                    resultado = suma(7, 5);
                    imprimirPorPantallaReal(resultado);
                    break;

                case "b":
                    resultado = resta(7, 5);
                    imprimirPorPantallaReal(resultado);
                    break;
                case "c":
                    resultado = multiplicacion(7, 5);
                    imprimirPorPantallaReal(resultado);
                    break;

                default:
                    System.exit(0);
            }


        }while(!opcion.equals("s"));


    }//main

    public static String aprobar(String prueba){
        prueba = prueba.toUpperCase();
        return prueba;
    }

    public static double suma(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    public static void imprimirPorPantallaReal(double resultado) {
        System.out.println("El resultado es: "+resultado);
    }

    public static void saludar(String nombre){
        System.out.println("Hola Don "+nombre);
    }

    public static double maximo3(double a, double b, double c) {
        double max = Double.MIN_VALUE;
        max = Math.max(Math.max(a,b), c);
        return max;
    }

}//clase