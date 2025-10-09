import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String [] alumnos = new String[3];

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Introduce el nombre del alumno " + i + ": ");
            alumnos[i] = sc.nextLine();
        }

        System.out.println("El nombre del alumno es " + alumnos[(int)(Math.random() * 2)]);

        double [] notas = new double[18];
        double suma = 0.0;
        for (int i = 0; i < notas.length; i++) {
            notas [i] = Math.min(10.0, (Math.random() * 10.0) + 0.5);
            System.out.println("La nota de la posicion " + i + " es: " + notas[i]);
            suma += notas[i];

        }

        double media = suma / notas.length;

        System.out.println("La nota media es: " + media);


        int [] []  precios = new int[3][3];
        for (int i = 0; i < precios.length; i++) {
            for(int j = 0; j < precios[i].length; j++) {
                precios[i][j] = (int) (Math.random() * 1000.0 );
            }
        }

        for (int i = 0; i < precios.length; i++) {
            for(int j = 0; j < precios[i].length; j++) {
                System.out.print(precios[i][j] + " ");
            }
            System.out.println();
        }
    }
}