import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        Ej 1: Crea un programa que pida diez números reales por teclado,
        los almacene en un array, y luego muestre todos sus valores.
        */
        double [] numerosReales = new double [10];
        for (int i = 0; i < numerosReales.length; i++) {
            System.out.println("Introduce el numero real " + (i+1) + ": ");
            numerosReales[i] = sc.nextDouble();
        }

        System.out.println(Arrays.toString(numerosReales));

        /*
        Ej 2: Crea un programa que pida diez números reales por teclado,
        los almacene en un array, y luego muestre la suma de todos los valores.
        */
        sc = new Scanner(System.in);
        double [] numerosReales2 = new double [10];
        double suma = 0.0;

        for (int i = 0; i < numerosReales2.length; i++) {
            System.out.println("Introduce el numero real " + (i+1) + ": ");
            numerosReales[i] = sc.nextDouble();
            suma += numerosReales[i];

        }

        System.out.println("La suma es: " + suma);


        /*
        Ej 3: Crea un programa que pida diez números reales por teclado,
        los almacene en un array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
        */
        double [] numerosReales3 = new double [10];
        double max = Double.MIN_VALUE,   min = Double.MAX_VALUE;

        for (int i = 0; i < numerosReales3.length; i++) {
            System.out.println("Introduce el numero real " + (i+1) + ": ");
            numerosReales[i] = sc.nextDouble();
        }

        for (int i = 0; i < numerosReales3.length; i++) {
            max = Math.max(numerosReales3[i], max);
            min = Math.min(numerosReales3[i], min);

//            if(numerosReales3[i] > max){
//                max = numerosReales3[i];
//            }
//            if(numerosReales3[i] < min){
//                min = numerosReales3[i];
//            }
        }


        /*
        Ej 4: Crea un programa que pida diez números reales por teclado,
        los almacene en un array, y luego  muestre por separado la suma de todos los valores positivos y negativos.
        */
        sc = new Scanner(System.in);
        double [] numerosReales4 = new double [10];
        double sumaP = 0.0, sumaN = 0.0;

        for (int i = 0; i < numerosReales4.length; i++) {
            System.out.println("Introduce el numero real " + (i+1) + ": ");
            numerosReales4[i] = sc.nextDouble();
            if(numerosReales4[i] >= 0) {
                sumaP += numerosReales4[i];
            }
            else{
                sumaN += numerosReales4[i];
            }

        }
        System.out.println("La suma es: " + sumaP);
        System.out.println("La suma es: " + sumaN);

        /*
        Ej 5: Crea un programa que pida diez números reales por teclado,
        los almacene en un array, y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores.
        */
        sc = new Scanner(System.in);
        double [] numerosReales5 = new double [10];
        double suma5 = 0.0;

        for (int i = 0; i < numerosReales5.length; i++) {
            System.out.println("Introduce el numero real " + (i+1) + ": ");
            numerosReales4[i] = sc.nextDouble();
            suma5 += numerosReales5[i];

        }

        System.out.println("La suma es: " + suma);
        System.out.println("La media es: " + (suma / numerosReales5.length));


        /*
        Ej 6: Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño N,
        escriba M en todas sus posiciones y lo muestre por pantalla.
        */
        sc = new Scanner(System.in);
        System.out.println("Introduce el valor de N para la dimension del array");
        int n = sc.nextInt();
        System.out.println("Introduce el valor de M");
        double m = sc.nextDouble();

        if(n > 0){
            double arrayN [] = new double[n];
            Arrays.fill(arrayN, m);
            System.out.println(Arrays.toString(arrayN));

            for(int i = 0; i < arrayN.length; i++){
                arrayN[i] =  m;
                System.out.println(arrayN[i]);
            }

        }
        else{
            System.out.println("No se pueden crear arrays con tamaño negativo");
        }


        /*
        Ej 7: Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga
        todos los valores desde P hasta Q, y lo muestre por pantalla.
        */
        sc = new Scanner(System.in);
        System.out.println("Introduce el valor de P");
        int p = sc.nextInt();
        System.out.println("Introduce el valor de Q");
        int q = sc.nextInt();

        // P = 5 y Q = 9 --> q-p = 4-1
        //P = 9 y Q = 5 -->  4 -1
        int dimension = Math.abs(q-p) -1;
        int [] numeros7 = new int [dimension];
        for(int i = 0; i < numeros7.length; i++){
            if(q > p){
                numeros7 [i] = p + (i+1);
                System.out.println(numeros7[i]);
            }
            else{
                numeros7 [i] = q + (i+1);
                System.out.println(numeros7[i]);
            }

        }

        /*
        Ej 8: Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
        utilizando Math.random(), y luego le pida al usuario un valor real R. Por último,
        mostrará cuántos valores del array son igual o superiores a R.
        */
        sc = new Scanner(System.in);
        double [] numeros8 = new double [100];

        for(int i = 0; i < numeros8.length; i++){
            numeros8 [i] = Math.random();
        }

        System.out.println("Introduce el valor de R (entre 0 y 1)");
        double r = sc.nextDouble();
        int contadorMayores = 0, contadorMenores = 0;

        for(int i = 0; i < numeros8.length; i++){
            if(numeros8 [i] >= r){
                contadorMayores++;
            }
            else{
                contadorMenores++;
            }
        }
        System.out.println("Los numeros mayores que R son: " + contadorMayores);
        System.out.println("Los numeros menores que R son: " + contadorMenores);




        /*
        Ej 9: Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores enteros
        aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y mostrará en qué
        posiciones del array aparece N.
        */
        sc = new Scanner(System.in);
        int [] numeros9 = new int [100];

        for(int i = 0; i < numeros9.length; i++){
            numeros9 [i] = (int) (Math.random() * 10 + 1); //cast --> conversion de tipo 10,7 --> 10
        }
        System.out.println("Introduce el valor de N");
        int nBuscar = sc.nextInt();

        for(int i = 0; i < numeros9.length; i++){
            if(numeros9[i] == nBuscar){
                System.out.println("Aparece en la posicion: " +i);
            }
        }

        /*
        Ej 10: Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas.
        Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado.
        Luego mostrará la altura media, máxima y mínima, así como cuántas personas miden por encima y
        por debajo de la media.
        */
        sc = new Scanner(System.in);
        System.out.println("Introduce el valor de N");
        int nAlturas = sc.nextInt();
        double [] alturas = new double [nAlturas];
        double sumaAlturas = 0.0, mediaAlturas = 0.0, maximaAlturas = Double.MIN_VALUE, minimaAlturas = Double.MAX_VALUE;

        for(int i = 0; i < alturas.length ; i++){
            System.out.println("Introduce el valor de la altura " + (i+1) + ": ");
            alturas[i] = sc.nextDouble();
            sumaAlturas += alturas[i];
        }

        mediaAlturas = sumaAlturas / alturas.length;

        int contadorAlturas = 0;
        for(int i = 0; i < alturas.length; i++){

            maximaAlturas = Math.max(alturas[i], maximaAlturas);
            minimaAlturas = Math.min(alturas[i], minimaAlturas);

            if(alturas[i] >= mediaAlturas){
                contadorAlturas++;
            }
        }

        System.out.println("La media es: " + mediaAlturas);
        System.out.println("La altura maxima es: " + maximaAlturas);
        System.out.println("La altura minima es: " + minimaAlturas);
        System.out.println("Personas por encima de la media: " + contadorAlturas);
        System.out.println("Persona por debajo de la media: " + (Math.abs(alturas.length - contadorAlturas)));





        /*
        Ej 11: Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el
        primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores del
        primer array al segundo array en orden inverso, y mostrar ambos por pantalla.
        */
        sc = new Scanner(System.in);


        /*
        Ej 12: Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con
        distintas opciones:
            a. Mostrar valores.
            b. Introducir valor.
            c. Salir.
        La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una posición P,
        luego escribirá V en la posición P del array. El menú se repetirá indefinidamente hasta que el usuario
        elija la opción ‘c’ que terminará el programa.
        */
        sc = new Scanner(System.in);


        /*
        Ej 13: Crea un programa que permita al usuario almacenar una secuencia aritmética en un array y
        luego mostrarla. Una secuencia aritmética es una serie de números que comienza por un valor inicial V,
        y continúa con incrementos de I. Por ejemplo, con V=1 e I=2, la secuencia sería 1, 3, 5, 7, 9…
        Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… El programa solicitará al usuario V, I además de
        N (nº de valores a crear).
        */
        sc = new Scanner(System.in);


        /*
        Ej 14: Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de valores:
        1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces,
        y luego la muestre por pantalla.
        */
        sc = new Scanner(System.in);


    }//main
}//class