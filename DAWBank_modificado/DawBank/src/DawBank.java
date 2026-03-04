import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DawBank {
    public static void main(String[] args) {
        Scanner sc;

        final String ibanPattern = "[A-Z]{2}[0-9]{22}";
        final String titularPattern = "[a-z A-Z]{3,}";
        final String dniPattern = "[0-9]{7-8}[A-Z]{1}";
        final String telefonoPattern = "[0-9]{9}";
        final String emailPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$";
        final String fechaPattern = "[0-9]{2}-[0-9]{2}-[0-9]{4}";

        CuentaBancaria miCuenta = null;

        String opcionCargar = MiUtils.comprobarPatronRepetidamente("[S,N]{1}", "¿Quieres cargar datos anteriores?");

        if(opcionCargar.equals("S")){
            miCuenta = cargarCuentaBancaria();
        }
        else{
            String nombre = MiUtils.comprobarPatronRepetidamente(titularPattern, "Introduce el nombre del titular");
            String IBAN = MiUtils.comprobarPatronRepetidamente(ibanPattern, "Introduce un IBAN");
            String dni = MiUtils.comprobarPatronRepetidamente(dniPattern, "Introduce el dni del titular");
            String direccion = MiUtils.comprobarPatronRepetidamente(titularPattern, "Introduce la dirección del titular");
            String telefono = MiUtils.comprobarPatronRepetidamente(telefonoPattern, "Introduce el telefono del titular");
            String email = MiUtils.comprobarPatronRepetidamente(emailPattern, "Introduce el email del titular");
            String fecha = MiUtils.comprobarPatronRepetidamente(fechaPattern, "Introduce la fecha de nacimiento del titular");

         miCuenta = new CuentaBancaria(IBAN, nombre,dni,
                    direccion, email, telefono, LocalDate.parse(fecha) );
        }

        String opcion = "";

        do{
            sc = new Scanner(System.in);

            imprimirMenuOpciones();
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println(miCuenta.toString());
                    break;

                case "2":
                    System.out.println("El IBAN es: " + miCuenta.getIBAN());
                    break;

                case "3":
                    System.out.println("El Titular es: " + miCuenta.getTitular().toString());
                    break;

                case "4":
                    System.out.println("El saldo es: " + miCuenta.getSaldo());
                    break;

                case "5":
                    ingresar(miCuenta);
                    break;

                case "6":
                    retirar(miCuenta);
                    break;

                case "7":
                    System.out.println(miCuenta.infoMovimientos());
                    break;

                case "8":
                    guardar(miCuenta);
                    break;

                case "9":
                    System.out.println("Gracias por elegir DawBANk, hasta la proxima.");
                    break;

                default:
                    System.out.println("Por favor, escoja la opcion correcta (1-8) ejem ejem ejem tonto");
            }

        }while(!opcion.equals("8"));

    }

    private static void retirar(CuentaBancaria miCuenta) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad a ingresar");
        double retirar = sc.nextDouble();

        try {
            if (miCuenta.retirar(retirar)) {
                System.out.println("La operación se ha realizado con exito");
            }
        }catch(CuentaException e){
            System.err.println(e.getMessage());
        }
        catch (AvisarHaciendaException e){
            System.err.println(e.getMessage());
        }
    }

    private static void ingresar(CuentaBancaria miCuenta) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad a ingresar");
        double cantidad = sc.nextDouble();

        try {
            if (miCuenta.ingresar(cantidad)) {
                System.out.println("La operación se ha realizado con exito");
            }
        }catch (AvisarHaciendaException e){
            System.err.println(e.getMessage());
        }
    }

    private static void imprimirMenuOpciones() {
        System.out.println("Escoga la opcion que desee");
        System.out.println("1. Datos de la cuenta");
        System.out.println("2. IBAN");
        System.out.println("3. Titular");
        System.out.println("4. Saldo");
        System.out.println("5. Ingreso");
        System.out.println("6. Retirada");
        System.out.println("7. Movimientos");
        System.out.println("8. Salir");
    }

    private static void guardar(CuentaBancaria miCuenta) {

        String path = "";
        String fileName = "";
        boolean fileMode = true;

        try(FileOutputStream file = new FileOutputStream(path+fileName, fileMode);
            ObjectOutputStream buffer = new ObjectOutputStream(file)){
            buffer.writeObject(miCuenta);

        } catch (IOException e) {
            System.err.println("Ha habido un problema al guardar: " + e.getMessage());
        }

    }

    private static CuentaBancaria cargarCuentaBancaria(){
        String path = "";
        String fileName = "";
        boolean eof = false;
        try(FileInputStream file = new FileInputStream(path+fileName);
            ObjectInputStream reader = new ObjectInputStream(file)){
            while (!eof) {
                Object obj = reader.readObject();
                if (obj instanceof CuentaBancaria) {
                    CuentaBancaria cuenta = (CuentaBancaria) obj;
                }
            }
        } catch (EOFException ex) {
            System.out.println("Se ha finalizado el archivo.");
            eof = true;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Ha habido un problema al guardar: " + e.getMessage());
        }

        return null;
    }
}