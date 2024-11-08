import java.util.Scanner;

public class despedida {

    public static void despedir() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Adios " + nombre);

        sc.close();
    }
}