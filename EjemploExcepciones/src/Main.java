//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String [] nombres = new String[3];

        String n = "2";
        int num = 0;
        try {
            num = Integer.parseInt(n);
            String nommbre = nombres[num];

        }catch (Exception e){
            System.out.println("Error:" + e.getMessage());

        } finally {
            System.out.println("El programa continua hasta el algoritmo");
        }

        try{
            for(int i = 0; i < nombres.length; i++){
                System.out.println(nombres[i].length());
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }

        for(int i = 0; i < nombres.length; i++) {
            try {
                System.out.println(nombres[i].length());
            } catch (Exception e) {
                System.out.println("\nError:" + e.getMessage());
                System.out.println("El texto es null por lo tanto no hay valor de length");
            }

        }


        System.out.println("Se ha finalizado el programa");
    }


}