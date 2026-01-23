import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Coche fordfi = new Coche("Ford", "Fiesta");
//        Scanner sc = new Scanner(System.in);
//         //Try - normal
//        try {
//            int velocidad = Integer.parseInt(sc.nextLine());
//            fordfi.acelerar(velocidad);
//            fordfi.acelerar(40);
//        } catch (ExcesoVelocidad2Exception e) {
//            System.out.println(e.getMessage());
//            fordfi.setVelocidad(120);
//            System.out.println("La velocidad se va a limitar a 120 km/h");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }


        //Try con recursos
        try(Scanner sc = new Scanner(System.in)) {
            int velocidad = Integer.parseInt(sc.nextLine());
            fordfi.acelerar(velocidad);

        } catch (ExcesoVelocidad2Exception e) {
            System.out.println(e.getMessage());
            fordfi.setVelocidad(120);
            System.out.println("La velocidad se va a limitar a 120 km/h");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println(fordfi);

    }
}