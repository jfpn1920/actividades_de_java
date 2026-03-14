package buenas_practicas_en_consola;
import java.util.Scanner;
public class cerrar_scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("hola, " + nombre + "!");
        scanner.close();
    }
}