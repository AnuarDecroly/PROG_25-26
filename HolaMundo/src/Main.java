import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre del usuario: ");
        String name = sc.nextLine();

        System.out.println("Introduce la edad del usuario: ");
        int edad = sc.nextInt();

        System.out.println("Introduce el saldo del usuario: ");
        double saldo = sc.nextDouble();

        System.out.println("El nombre introducido es: " + name + " su edad es " + edad +
                " y su saldo es " + saldo + "€");


    }
}