import java.util.Scanner;

public class saludo {

    public static void saludar() {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime tu nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Hola " + nombre);

        sc.close();
    }

    public void saludarConEdad () {

        Scanner sc = new Scanner(System.in);

        System.out.print("Dime tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("¿Cuantos años tienes?: ");
        int edad = sc.nextInt();

        if (edad < 18) {
            System.out.println("Hola " + nombre + " eres bastante joven");
        } else {
            System.out.println("Hola " + nombre + " espero que tengas un buen día");
        }
        
        sc.close();

    }
}