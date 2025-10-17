import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        /*
        Realiza un programa que muestre un menú de opciones como el siguiente:
        1. Sumar
        2. Restar
        3. Multiplicar
        4. Dividir (incluir manejo de división por 0)
        5. Salir El menú debe de repetirse hasta que se escoja la opción 5 (Salir).
        */

        double num1 = 0.0, num2 = 0.0;
        Scanner sc = new Scanner(System.in);
        String opcion = "5";

        do{
            sc = new Scanner(System.in);
            System.out.println("Ingrese la opcion del menu que desea realizar: ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = sc.nextLine();

            switch(opcion){
                case "1":
                    sc = new Scanner(System.in);
                    System.out.println("Introduce el primer numero: ");
                    num1 = sc.nextDouble();
                    System.out.println("Introduce el segundo numero: ");
                    num2 = sc.nextDouble();
                    System.out.println("La suma de los dos numeros es: " +(num1 + num2));
                    break;

                case "2":
                    sc = new Scanner(System.in);
                    System.out.println("Introduce el primer numero: ");
                    num1 = sc.nextDouble();
                    System.out.println("Introduce el segundo numero: ");
                    num2 = sc.nextDouble();
                    System.out.println("La resta de los dos numeros es: " +(num1 - num2));
                    break;

                case "3":
                    sc = new Scanner(System.in);
                    System.out.println("Introduce el primer numero: ");
                    num1 = sc.nextDouble();
                    System.out.println("Introduce el segundo numero: ");
                    num2 = sc.nextDouble();
                    System.out.println("La multiplicacios de los dos numeros es: " +(num1 * num2));
                    break;

                case "4":
                    sc = new Scanner(System.in);
                    System.out.println("Introduce el primer numero: ");
                    num1 = sc.nextDouble();
                    System.out.println("Introduce el segundo numero: ");
                    num2 = sc.nextDouble();
                    if(num2 != 0.0){
                        System.out.println("La division de los dos numeros es: " +(num1 / num2));
                    }
                    else{
                        System.out.println("NO se puede divir entre 0: ");
                    }
                    break;

                case "5":
                    System.out.println("El programa se cerrara");
                    break;

                default:
                    System.out.println("Por favor escoja entre las opciones indicadas");
            }
        }while(!opcion.equals("5"));




    }
}
