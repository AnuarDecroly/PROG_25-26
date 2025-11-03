import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * Ejercicio 1:  Crea un programa que cree una matriz de tamaño 5x5 que
         * almacene los números del 1 al 25 y luego muestre la matriz por pantalla
         */
        System.out.println("Ejercicio 1:");
        int num = 1;
        int [][] matriz1 = new int[5][5];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = num;
                num++;
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }


        /**
         * Ejercicio 2: Crea un programa que cree una matriz de 10x10 e introduzca
         * los valores de las tablas de multiplicar del 1 al 10 (cada tabla en una fila).
         * Luego mostrará la matriz por pantalla
         */
        System.out.println("\nEjercicio 2:");
        int [][] matriz2 = new int[10][10];
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = (i + 1) * (j + 1);
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }

        /**
         * Ejercicio 3: Crea un programa que cree una matriz de tamaño NxM
         * (tamaño introducido por teclado) e introduzca en ella NxM valores
         * (también introducidos por teclado). Luego deberá recorrer la matriz
         * y al final mostrar por pantalla cuántos valores son mayores que cero,
         * cuántos son menores que cero y cuántos son igual a cero
         */
        System.out.println("\nEjercicio 3:");
        double[][] matriz3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la dimension N de la matriz: ");
        int n = sc.nextInt();
        System.out.print("Ingrese la dimension M de la matriz: ");
        int m = sc.nextInt();

        if(n >0 && m>0){
            matriz3 = new double[n][m];

            int nPositivos = 0, nNegativos = 0, nNulos = 0;
            for (int i = 0; i < matriz3.length; i++) {
                for (int j = 0; j < matriz3[i].length; j++) {
                    sc = new Scanner(System.in);
                    System.out.println("Ingrese el valor i= " + i + " j= "+j);
                    double valor = sc.nextDouble();
                    matriz3[i][j] = valor;

                    if(valor == 0){
                        nNulos++;
                    }else if(valor > 0){
                        nPositivos++;

                    }else {
                        nNegativos++;
                    }
                }
            }

            for (int i = 0; i < matriz3.length; i++) {
                for (int j = 0; j < matriz3[i].length; j++) {
                    System.out.print(matriz3[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Hay "+nPositivos + " valores positivos en la matriz");
            System.out.println("Hay "+nNegativos + " valores negativos en la matriz");
            System.out.println("Hay "+nNulos + " valores nulos en la matriz");
        }
        else{
            System.out.print("Las dimensiones deben de ser positivas");
        }


        /**
         * Ejercicio 4: Necesitamos crear un programa para almacenar las notas de 4 alumnos
         * (llamados “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá
         * las notas por teclado y luego el programa mostrará la nota mínima, máxima y media
         * de cada alumno
         */



        /**
         * Ejercicio 5: Necesitamos crear un programa para registrar sueldos de hombres y
         * mujeres de una empresa y detectar si existe brecha salarial entre ambos. El
         * programa pedirá por teclado la información de N personas distintas (valor también
         * introducido por teclado). Para cada persona, pedirá su género (0 para varón y 1 para
         * mujer) y su sueldo. Esta información debe guardarse en una única matriz. Luego se
         * mostrará por pantalla el sueldo medio de cada género
         */
    }
}