import java.util.Scanner;

import static java.lang.System.exit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce la nota del alumno:");
    double nota =  sc.nextDouble();

    if( nota < 0){
        System.out.println("La nota no puede ser negativa");
    }
    else if(nota < 5){
        System.out.println("La nota es INSUFICIENTE.");
    }
    else if(nota < 6){
        System.out.println("La nota es SUFICIENTE.");
        if(nota == 5.6){

        }
    }
    else if(nota < 7){
        System.out.println("La nota es BIEN.");
    }
    else if(nota < 9){
        System.out.println("La nota es Notable.");
    }
    else if(nota <= 10){
        System.out.println("La nota es SOBRESALIENTE.");
    }
    else {
        System.out.println("La nota no puede ser mayor de 10.");
    }


    if(nota >= 0 && nota < 5){
        System.out.println("La nota es INSUFICIENTE.");
    }


    if(nota >= 5 && nota < 6){
        System.out.println("La nota es BIEN.");
    }

    if(nota >= 6 && nota < 7){
        System.out.println("La nota es SUFICIENTE.");
    }

    if(nota >= 7 && nota < 9){
        System.out.println("La nota es NOTABLE.");
    }

    if(nota >= 9 && nota <= 10){
        System.out.println("La nota es SOBRESALIENTE.");
    }


    sc = new Scanner(System.in);
    System.out.println("\nEscoja la opcion deseada de las siguientes opciones:");
    System.out.println("1. Ingresar datos");
    System.out.println("2. Ver todos los datos");
    System.out.println("3. Eliminar");
    System.out.println("4. Salir");

    String opcion = sc.next();
    switch (opcion) {
        case "1":
            sc = new Scanner(System.in);
            System.out.println("Ingrese el valor del alumno:");
            String nombre = sc.nextLine();
            break;

        case "2":
            System.out.println("La clase contiene estos alumnos:");
            break;

        case "3":
            System.out.println("Se han eliminado todos los alumnos");
            break;

        case "4":
            System.out.println("Se va a cerrar el programa");
            System.exit(0);
            break;

        default:
            System.out.println("Por favor escoga una opcion correcta");

    }

        // Nuevo sintaxis Switch Expression
        int nota2 = 3;
        String notaTexto = switch (nota2) {
            case 1 -> "INSUFICIENTE";
            case 2 -> "INSUFICIENTE";
            case 3 -> "INSUFICIENTE";
            case 4 -> "INSUFICIENTE";
            case 5 -> "SUFICIENTE";
            case 6 -> "BIEN";
            case 7 -> "NOTABLE";
            case 8 -> "NOTABLE";
            case 9 -> "SOBRESALIENTE";
            case 10 -> "SOBRESALIENTE";
            default -> "NOTA NO VALIDA"; // Obligatorio para que la expresión sea completa
        };

        System.out.println("La nota del alumno es:" + notaTexto);

        //Ejemplos bucles

        int sumaN = 0;
        for(int i = 0; i <= 10; i++) {
            System.out.println("El numero es: " + i);
            sumaN = sumaN + i;
            System.out.println("La suma de los alumnos es:" + sumaN);
        }
        System.out.println("La suma de los alumnos es:" + sumaN);

    }//main
}//class