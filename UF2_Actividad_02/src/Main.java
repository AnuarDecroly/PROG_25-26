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


        /*
        Ejercicio 9: Escribe un programa que recibe como datos de entrada
        una hora expresada en horas, minutos y segundos que nos calcula
        y escribe la hora, minutos y segundos que serán, transcurrido un segundo.
        */
        System.out.println("\nEjercicio 09");
        sc = new Scanner(System.in);

        System.out.println("Introduce los segundos: ");
        int segundos = sc.nextInt();
        System.out.println("Introduce los minutos:" );
        int minutos = sc.nextInt();
        System.out.println("Introduce las horas: ");
        int horas = sc.nextInt();

        System.out.println("La hora actual es: " + horas + ":" + minutos + ":" + segundos);

        segundos ++;

        if(segundos >= 60){

            minutos ++;
            segundos = 0;

            if(minutos >= 60){
                horas++;
                minutos = 0;

                if(horas >= 24){
                    horas = 0;
                }
            }
        }

        System.out.println("La hora modificada es: " + horas + ":" + minutos + ":" + segundos);


        /*
        Ejercicio 10:  Realiza un programa que lea 10 números no nulos
        y luego muestre un mensaje de si ha leído algún número negativo o no.
        */
        System.out.println("\nEjercicio 10");
        sc = new Scanner(System.in);

        boolean hayNegativos = false;
        for(int i = 0; i < 10; i++){
            System.out.println("Introduce un numero  distinto de cero: ");
            double n = sc.nextDouble();
            if(n < 0){
                hayNegativos = true;
            }
        }
        System.out.println("Hay numeros negativos: " + hayNegativos);

        /*
        Ejercicio 11: Realiza un programa que lea 10 números no nulos
        y luego muestre un mensaje indicando cuántos son positivos y cuantos negativos.
        */
        System.out.println("\nEjercicio 11");
        sc = new Scanner(System.in);

        int nPositivos = 0;
        int nNegativos = 0;
        for(int i = 0; i < 10; i++){
            System.out.println("Introduce un numero  distinto de cero: ");
            double n = sc.nextDouble();
            if(n < 0){
                nNegativos ++;
            }
            if(n > 0){
                nPositivos++;
            }
        }
        System.out.println("Hay" + nNegativos + "numeros negativos y hay " + nPositivos + " numeros positivos");

        /*
        Ejercicio 12: Realiza un programa que lea una secuencia de números no nulos
        hasta que se introduzca un 0, y luego muestre si ha leído algún número
        negativo, cuantos positivos y cuantos negativos.
        */
        System.out.println("\nEjercicio 12");
        sc = new Scanner(System.in);
        int numero = 0;
        int numeroNegativos = 0;
        int numeroPositivos = 0;

        do{
            System.out.println("Introduce un numero  distinto de cero o cero para parar: ");
            numero = sc.nextInt();
            if(numero < 0){
                numeroNegativos++;
            }
            if(numero > 0){
                numeroPositivos++;
            }

        }while(numero != 0);

        System.out.println("Hay" + numeroNegativos + "numeros negativos y hay " + numeroPositivos + " numeros positivos");


        /*
        Ejercicio 13: Realiza un programa que calcule y escriba la suma y el producto
        de los 10 primeros números naturales.
        */
        System.out.println("\nEjercicio 13");
        sc = new Scanner(System.in);

        int suma = 0;
        int multiplica = 1;

        for(int i = 1; i <= 10; i++){
            suma  = suma + i; // suma += i;
            multiplica = multiplica * i; // multiplica *= i;
        }
        System.out.println("La suma de los 10 primeros numeros naturales es: " + suma);
        System.out.println("La multiplicacion de los 10 primeros numeros naturales es: " + multiplica);


        /*
        Ejercicio 14: Escribe un programa que calcula el salario neto semanal de un trabajador en función
        del número de horas trabajadas y la tasa de impuestos de acuerdo a las siguientes hipótesis:
        • Las primeras 35 horas se pagan a tarifa normal.
        • Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
        • Las tasas de impuestos son: • Los primeros 500 euros son libres de impuestos.
        • Los siguientes 400 tienen un 25% de impuestos.
        • Los restantes un 45% de impuestos.
        Escribir nombre, salario bruto, tasas y salario neto.
        */
        System.out.println("\nEjercicio 14");
        sc = new Scanner(System.in);
        double tarifaNormal = 25.0;

        System.out.println("Introduce el nombre del trabajador");
        String nombre = sc.nextLine();

        System.out.println("Introduce el numero de horas trabajadas");
        double horasTrabajadas = sc.nextDouble();

        double salarioBruto = 0.0;
        double salarioNeto = 0.0;
        if(horasTrabajadas >= 0 && horasTrabajadas <= 35){
            salarioBruto = tarifaNormal * horasTrabajadas;
        } else if (horasTrabajadas> 35) {
            salarioBruto = 1.5 * tarifaNormal * (horasTrabajadas-35) + 35 * tarifaNormal;

        } else{
            System.out.println("Las horas trabajadas no pueden ser negativas");
        }

        if(salarioBruto <= 500){
            salarioNeto = salarioBruto;
        }
        else if(salarioBruto > 500 && salarioBruto <= 900){
            salarioNeto = 500 +  (salarioBruto - 500) * 0.75;
        }
        else if(salarioBruto > 900 ){
            salarioNeto = 500 +  (salarioBruto - 500) * 0.75 + (salarioBruto - 900) * 0.55;
        }

        System.out.println("El nombre del trabajador es: " + nombre);
        System.out.println("El numero de horas trabajadas es: " + horas);
        System.out.println("La tarifa por hora es: " + tarifaNormal);
        System.out.println("La salario bruto es: " + salarioBruto);
        System.out.println("La salario neto es: " + salarioNeto);
        System.out.println("Las tasas aplicadas son: " + (salarioBruto - salarioNeto));

    }
}