import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Ejercicio 1
        System.out.println("Ejercicio 01");
        System.out.println("Buenos días futuros programadores\n");

        /*
        Ejercicio 2: Escribe un programa que calcule y muestre
        el área de un cuadrado de lado igual a 5.
        */
        System.out.println("Ejercicio 02");
        double lado = 5;
        double area = lado * lado;
        System.out.println("Lado: " + lado);
        System.out.println("Area: " + area);

        /*
        Ejercicio 3: Escribe un programa que calcule el área de
        un cuadrado cuyo lado se introduce por teclado.
        */
        System.out.println("\nEjercicio 03");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor del lado del cuadrado");
        double lado2 = sc.nextDouble();

        double area2 = lado2 * lado2;
        System.out.println("Lado: " + lado2);
        System.out.println("Area: " + area2);
    }
}