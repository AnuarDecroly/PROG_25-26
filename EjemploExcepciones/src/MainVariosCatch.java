import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainVariosCatch {
    public static void  main(String[] args) {
        Scanner lector = null;
        try {

            lector = new Scanner(System.in);
            System.out.println("Introduce dividendo: ");
            String texto = lector.nextLine();

            int dividendo = Integer.parseInt(texto);

            System.out.println("Introduce divisor: ");
            texto = lector.nextLine();
            int divisor = Integer.parseInt(texto);

            int resultado = dividendo / divisor;
            int resto = dividendo % divisor;

            System.out.println("Resultado división: " + resultado);
            System.out.println("Resto: " + resto);

        }
        //MultiCatch
//        catch (NumberFormatException | ArithmeticException e) {
//
//        }
        catch(NumberFormatException e) {
            System.out.println("Ha introducido un texto que no corresponde con un numero");

        }
        catch(ArithmeticException e) {
            System.out.println("El divisor no puede ser cero");

        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());

        }
        finally
        {
            if(lector != null)
            {
                lector.close();
            }
        }
    }
}


