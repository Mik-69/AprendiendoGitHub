import java.util.Scanner;

public class saludo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime tu nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Hola " + nombre);

        sc.close();
    }
}