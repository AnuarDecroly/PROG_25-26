import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * Ejercicio 1: Crea un programa que pida una cadena de texto por teclado y
         * luego muestre cada palabra de la cadena en una línea distinta.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

        String [] palabras = frase.split(" ");
        for(String palabra : palabras){
            System.out.println(palabra);
        }


        /**
         * Ejercicio 2: Crea un programa que pida dos cadenas de texto por teclado
         * y luego indique si son iguales, además de si son iguales sin diferenciar
         * entre mayúsculas y minúsculas.
         */
        sc = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase1 = sc.nextLine();
        System.out.println("Introduce otra frase: ");
        String frase2 = sc.nextLine();

        System.out.println("¿Las frases son iguales? : " +frase1.equals(frase2));
        System.out.println("¿Las frases son iguales ignorando las mayusculas? : " +frase1.equalsIgnoreCase(frase2));


        /**
         * Ejercicio 3: Crea un programa que pida por teclado tres cadenas de texto:
         * nombre y dos apellidos. Luego mostrará un código de usuario (en mayúsculas)
         * formado por la concatenación de las tres primeras letras de cada uno de ellos.
         * Por ejemplo, si se introduce “Lionel”, “Tarazón” y “Alcocer” mostrará “LIOTARALC”.
         */
        sc = new Scanner(System.in);
        System.out.println("Introduce el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce el primer apellido: ");
        String primerApellido = sc.nextLine();
        System.out.println("Introduce el segundo apellido: ");
        String segundoApellido = sc.nextLine();

        String cNombre = nombre.substring(0, 3).toUpperCase();
        String cApellido = primerApellido.substring(0, 3).toUpperCase();
        String cSegundoApellido = segundoApellido.substring(0, 3).toUpperCase();
        String codigo = cNombre + cApellido + cSegundoApellido;

        //La opcion rapida
//        codigo = nombre.substring(0, 3).toUpperCase() + primerApellido.substring(0, 3).toUpperCase()
//                + segundoApellido.substring(0, 3).toUpperCase();

        System.out.println("EL CODIGO ES: " + codigo);

        /**
         * Ejercicio 4: Crea un programa que muestre por pantalla cuantas vocales de cada tipo
         * hay (cuantas ‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe
         * diferenciar entre mayúsculas y minúsculas.
         */
        sc = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase4 = sc.nextLine();

        int a = 0, e =0, ies = 0, o = 0, u = 0;

        for(int i = 0; i < frase4.length(); i++){
            switch(frase4.toLowerCase().charAt(i)){
                case 'a' -> a++;
                case 'e' -> e++;
                case 'i' -> ies++;
                case 'o' -> o++;
                case 'u' -> u++;
            }
        }

        System.out.println("El numero de aes es: " + a);
        System.out.println("El numero de es es: " + e);
        System.out.println("El numero de aes ies: " + ies);
        System.out.println("El numero de aes oes: " + o);
        System.out.println("El numero de aes ues: " + u);


        /**
         * Ejercicio 5: Realiza un programa que lea una frase por teclado e indique si
         * la frase es un palíndromo o no (ignorando espacios y sin diferenciar entre
         * mayúsculas y minúsculas). Supondremos que el usuario solo introducirá letras
         * y espacios (ni comas, ni puntos, ni acentos, etc.).
         */


        sc = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String fraseOriginal = sc.nextLine();

        String fraseProcesada = fraseOriginal.replaceAll(" ", "").toLowerCase();

        if (esPalindromo(fraseProcesada)) {
            System.out.println("Resultado: La frase ES un palíndromo.");
        } else {
            System.out.println("Resultado: La frase NO es un palíndromo.");
        }


    }

    private static boolean esPalindromo(String texto) {
        boolean palindromo = false;

        // Puntero de la izquierda (inicio)
        int izquierda = 0;

        // Puntero de la derecha (final)
        int derecha = texto.length() - 1;

        while (izquierda < derecha) {

            // Comparamos los caracteres en las posiciones de los punteros
            if (texto.charAt(izquierda) != texto.charAt(derecha)) {
                return palindromo; // Si son diferentes, no es palíndromo
            }

            // Si son iguales, movemos los punteros
            izquierda++; // Hacia la derecha
            derecha--;   // Hacia la izquierda
        }

        // Si el bucle termina sin encontrar diferencias, es un palíndromo
        palindromo = true;
        return palindromo;
    }



}