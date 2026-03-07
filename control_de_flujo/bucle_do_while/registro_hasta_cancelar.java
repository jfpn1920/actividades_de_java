package bucle_do_while;
import java.util.Scanner;
public class registro_hasta_cancelar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        String continuar;
        System.out.println("registro de usuarios");
        do {
            System.out.print("ingrese nombre del usuario: ");
            nombre = scanner.nextLine();
            System.out.println("usuario registrado: " + nombre);
            System.out.print("¿desea registrar otro usuario? (s/n): ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("s"));
        System.out.println("registro finalizado, ¡gracias!");
        scanner.close();
    }
}