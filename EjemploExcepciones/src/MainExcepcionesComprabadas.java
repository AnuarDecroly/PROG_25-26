import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainExcepcionesComprabadas
{
    public static void main(String[] args)
    {
        FileReader fichero =  null;
        try {
             fichero = new FileReader("c:/men.docx");
            System.out.println("El fichero ha sido abierto");
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        }


        try {
            FileReader  fichero2 = ejecutarAbrirFichero("c:/men.docx");
            System.out.println("El fichero ha sido abierto");
        } catch (IOException e) {
            System.out.println("Fichero no encontrado");
        }


    }

    public static FileReader ejecutarAbrirFichero(String ruta) throws IOException
    {
        return abrirFichero(ruta);
    }

    public static FileReader abrirFichero(String ruta) throws IOException
    {
        FileReader fichero2 = new FileReader(ruta);
        return fichero2;
    }
}
