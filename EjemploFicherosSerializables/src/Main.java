import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        final String pathNew = "./src/resources/";
        final String fileName = "alumnos.dat";
        boolean fileMode = false;

        Alumno pp = new Alumno("Pepe",18, "Blanco","pp@email.com");
        pp.calificar("Programacion", 5);
        pp.calificar("BBDD", 7);
        pp.calificar("Lenguajes de marcas", 7);
        pp.calificar("Sistemas informaticos", 9);
        pp.calificar("Ingles", 4);

        Alumno paco = new Alumno("Paco",18, "Blanco","pp@email.com");
        paco.calificar("Programacion", 3);
        paco.calificar("BBDD", 5);
        paco.calificar("Lenguajes de marcas", 5);
        paco.calificar("Sistemas informaticos", 6);
        paco.calificar("Ingles", 7);

        Alumno adolf = new Alumno("Adolfo",18, "Blanco","pp@email.com");
        adolf.calificar("Programacion", 7);
        adolf.calificar("BBDD", 8);
        adolf.calificar("Lenguajes de marcas", 8);
        adolf.calificar("Sistemas informaticos", 9);
        adolf.calificar("Ingles", 10);

        List<Alumno> alumnos = new LinkedList<>();
        alumnos.add(pp);
        alumnos.add(paco);
        alumnos.add(adolf);

        //Usar try-cath-with resources
        escribirEnFichero(pathNew, fileName, fileMode, alumnos);

//        //Creacion y/o apertura del archivo
//        FileOutputStream file;
//        ObjectOutputStream buffer;
//
//        try{
//            file =  new FileOutputStream(path+fileName, fileMode);
//            buffer = new ObjectOutputStream(file);
//        } catch (IOException e) {
//            System.out.println("Error al abrir el archivo: "+e.getMessage());
//            return;
//        }
//
//        //Escritura del fichero
//        try{
//            buffer.writeObject(pp);
//            System.out.println("Archivo guardado correctamente");
//
//        }catch (IOException e) {
//            System.out.println("Error al escribir en el archivo: "+e.getMessage());
//        }
//
//        //Cerrar los flujos
//        try{
//            file.close();
//            buffer.close();
//        }catch (IOException e) {
//            System.out.println("Error al cerrar el archivo: "+e.getMessage());
//        }
    }

    private static void escribirEnFichero(String pathNew, String fileName, boolean fileMode, List<Alumno> alumnos) {
        try(FileOutputStream file = new FileOutputStream(pathNew + fileName, fileMode);
            ObjectOutputStream buffer = new ObjectOutputStream(file)){
            for(Alumno alumno : alumnos){
                buffer.writeObject(alumno);
            }
            System.out.println("Se ha escrito el fichero correctamente");

        } catch (IOException e) {
            System.out.println("Error al abrir el archivo: "+e.getMessage());
        }
    }
}