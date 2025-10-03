import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    
        // Ejercicio 1: Escribe un programa que dé los “buenos días”.
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

        /*
         Ejercicio 4: Escribe un programa que lea dos números, calcule y
         muestre el valor de sus suma, resta, producto y división.
        */
        System.out.println("\nEjercicio 04");
        sc = new Scanner(System.in);
        System.out.println("Introduce el valor del primer numero");
        double num1 = sc.nextDouble();
        System.out.println("Introduce el valor del segundo numero");
        double num2 = sc.nextDouble();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;

        System.out.println("La suma de "+ num1 + " + " + num2 + " = " + suma);
        System.out.println("La resta de "+ num1 + " - " + num2 + " = " + resta);
        System.out.println("La multiplicacion de "+ num1 + " * " + num2 + " = " + multiplicacion);
        System.out.println("La division de "+ num1 + " / " + num2 + " = " + division);

        /*
         Ejercicio 5: Escribe un programa que toma como dato de entrada un número
         que corresponde a la longitud de un radio y nos escribe la longitud de la
         circunferencia, el área del círculo y el volumen de la esfera que corresponden con dicho radio.
        */
        System.out.println("\nEjercicio 05");
        sc = new Scanner(System.in);
        System.out.println("Introduce el valor del radio");
        double radio = sc.nextDouble();

        double longitud = 2 * Math.PI * radio;
        double areaC = Math.PI * Math.pow(radio, 2);
        double volumenC = (4.0/3.0) * Math.PI * Math.pow(radio, 3);

        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El area de la circunferencia es: " + areaC);
        System.out.println("La volumen de la circunferencia es: " + volumenC);

        /*
         Ejercicio 6: Escribe un programa que dado el precio de un artículo
         y el precio de venta real nos muestre el porcentaje de descuento realizado.
        */
        System.out.println("\nEjercicio 06");
        sc = new Scanner(System.in);

        System.out.println("Introduce el valor del precio real");
        double precioR = sc.nextDouble();
        System.out.println("Introduce el valor del precio de venta");
        double precioV = sc.nextDouble();

        double descuento = ((precioR - precioV) / precioR) * 100.0;

        System.out.println("El descuento es: " + descuento + "%");

        /*
         Ejercicio 7: Escribe un programa que lea un valor correspondiente a una
         distancia en millas marinas y escriba la distancia en metros. Sabiendo
         que una milla marina equivale a 1.852 metros.
        */
        System.out.println("\nEjercicio 07");
        sc = new Scanner(System.in);

        System.out.println("Introduce la distancia en millas marinas");
        double distanciaMillas = sc.nextDouble();

        double distanciaMetros = 1852.0 * distanciaMillas;

        System.out.println("La distancia equivalente en metros es: " + distanciaMetros);


        /*
         Ejercicio 8: Escribe un programa que lee dos números y los visualiza en orden ascendente.
        */
        System.out.println("\nEjercicio 08");
        sc = new Scanner(System.in);

        System.out.println("Introduce el valor del primer numero");
        double primero = sc.nextDouble();
        System.out.println("Introduce el valor del segundo numero");
        double segundo = sc.nextDouble();

        System.out.println("El orden ascendente es: " + Math.min(primero, segundo)
                + " , " + Math.max(primero, segundo));

        /*
         Ejercicio 9: Escribe un programa que lee dos números y nos dice
         cuál es el mayor o si son iguales.
        */
        System.out.println("\nEjercicio 09");
        sc = new Scanner(System.in);

        System.out.println("Introduce el valor del primer numero");
        double numero1 = sc.nextDouble();
        System.out.println("Introduce el valor del segundo numero");
        double numero2 = sc.nextDouble();

        System.out.println("El numero mayor es: " + Math.max(numero1, numero2));
        System.out.println("¿Los numeros son iguales?: " + (numero1 == numero2));

        /*
         Ejercicio 10: Escribe un programa que lea tres números distintos y nos diga cuál es el mayor.
        */
        System.out.println("\nEjercicio 10");
        sc = new Scanner(System.in);

        System.out.println("Introduce el valor del primer numero");
        double n1 = sc.nextDouble();
        System.out.println("Introduce el valor del segundo numero");
        double n2 = sc.nextDouble();
        System.out.println("Introduce el valor del tercer numero");
        double n3 = sc.nextDouble();

        double max = Math.max(Math.max(n1, n2), n3);
        System.out.println("El valor maximo es: " + max);

        /*
         Ejercicio 11: Escribe un programa que lee dos números, calcula y muestra el valor de su suma,
         resta, producto y división. (Ten en cuenta la división por cero).
        */
        System.out.println("\nEjercicio 11");
        sc = new Scanner(System.in);

        System.out.println("Introduce el valor del primer numero");
        num1 = sc.nextDouble();
        System.out.println("Introduce el valor del segundo numero (OJO no puede ser cero)");
        num2 = sc.nextDouble();

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;

        System.out.println("La suma de "+ num1 + " + " + num2 + " = " + suma);
        System.out.println("La resta de "+ num1 + " - " + num2 + " = " + resta);
        System.out.println("La multiplicacion de "+ num1 + " * " + num2 + " = " + multiplicacion);
        System.out.println("La division de "+ num1 + " / " + num2 + " = " + division);


        /*
         Ejercicio 12:  Escribe un programa que lee 2 números y muestra el mayor.
        */
        System.out.println("\nEjercicio 12");
        sc = new Scanner(System.in);

        System.out.println("Introduce el valor del primer numero");
        numero1 = sc.nextDouble();
        System.out.println("Introduce el valor del segundo numero");
        numero2 = sc.nextDouble();

        System.out.println("El numero mayor es: " + Math.max(numero1, numero2));


        /*
         Ejercicio 13:  Escribe un programa que lee un número y me dice si es positivo
         o negativo consideraremos el cero como positivo.
        */
        System.out.println("\nEjercicio 13");
        sc = new Scanner(System.in);

        System.out.println("Introduce el valor del primer numero");
        double nu1 = sc.nextDouble();

        System.out.println("¿El numero es positivo?: " +(nu1 >= 0));


        sc.close();

    }
}