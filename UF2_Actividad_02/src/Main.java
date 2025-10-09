import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        Ejercicio 1: Escribe un programa que pide la edad por teclado y
        nos muestra el mensaje de “Eres mayor de edad” solo si lo somos
         */
        System.out.println("\nEjercicio 01");
        System.out.println("Introduce la edad: ");
        int edad = sc.nextInt();

        if( edad >= 18) {
            System.out.println("Eres mayor de edad");
        }

        /*
        Ejercicio 2: Escribe un programa que pide la edad por teclado y
        nos muestra el mensaje de “Eres mayor de edad”  o el mensaje eres menor de edad
        */
        System.out.println("\nEjercicio 02");
        sc = new Scanner(System.in);
        System.out.println("Introduce la edad: ");
        int edad2 = sc.nextInt();

        if( edad2 >= 18) {
            System.out.println("Eres mayor de edad");

        } else if( edad2 < 18 && edad2 >= 0)  {
            System.out.println("Eres menor de edad");
        }
        else{
            System.out.println("La edad no tiene sentido");
        }

        /*
        Ejercicio 3: Realiza un programa que muestre por pantalla los 20 primeros números naturales
        */
        System.out.println("\nEjercicio 03");
        for(int i = 1; i <= 20; i++){
            System.out.println("El numero natural es: "+i);
        }

        /*
        Ejercicio 4: Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200.
        Para ello utiliza un contador y suma de 2 en 2.
        */
        System.out.println("\nEjercicio 04");
        for(int i = 2; i <= 200; i = i + 2){
            System.out.println("El par es: "+i);
        }

        /*
        Ejercicio 5: Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200.
        Para ello utiliza un contador y suma de 1 en 1.
        */
        System.out.println("\nEjercicio 05");
        for(int i = 1; i <= 200; i++){
            if( i % 2 == 0){
                System.out.println("El par es: "+i);
            }
        }

        /*
        Ejercicio 6: Realiza un programa que muestre los números desde
        el 1 hasta un número N que se introducirá por teclado.
        */
        System.out.println("\nEjercicio 06");
        sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            System.out.println("El numero natural es: "+i);
        }

        /*
        Ejercicio 7: Escribe un programa que lea una calificación numérica entre
        0 y 10 y la transforma en calificación alfabética, escribiendo el resultado.
        */
        System.out.println("\nEjercicio 07");
        sc = new Scanner(System.in);
        System.out.println("Introduce la calificacion: ");
        double nota = sc.nextDouble();

        if(nota < 0.0 || nota > 10.0){
            System.out.println("La nota es incorrecta: "+nota);
        }
        else{

            if (nota < 3.0) {
                System.out.println("La nota es MUY DEFICIENTE");
            }

            if(nota >= 3.0 && nota < 5){
                System.out.println("La nota es INSUFICIENTE");
            }

            if(nota >= 5.0 && nota < 7){
                System.out.println("La nota es BIEN");

            }

            if(nota >= 7.0 && nota < 9){
                System.out.println("La nota es NOTABLE");
            }

            if(nota >= 9 && nota <= 10){
                System.out.println("La nota es SOBRESALIENTE");
            }
        }

        /*
        Ejercicio 8: Realiza un programa que lea un número positivo N
        y calcule y visualice su factorial N!.
        */
        System.out.println("\nEjercicio 08");
        sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num2 = sc.nextInt();

        //FACTORIAL ej num = 5 --> factorial = 5 * 4 * 3 * 2 * 1  --> 1 * 2 * 3 * 4 * 5
        int factorial = 1;
        for(int i = 1; i <= num2; i++){
            factorial = factorial * i;
        }
        System.out.println("El factorial es: " + factorial);


        System.out.println("\nEjercicio 09");



        System.out.println("\nEjercicio 10");


        System.out.println("\nEjercicio 11");

    }
}