package bucle_do_while;
import java.util.Scanner;
public class ingresar_datos_minimo_una_vez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dato;
        String continuar;
        System.out.println("ingresar datos minimo una vez");
        do {
            System.out.print("ingrese un dato: ");
            dato = scanner.nextLine();
            System.out.println("dato ingresado: " + dato);
            System.out.print("¿desea ingresar otro dato? (s/n): ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("s"));
        System.out.println("ingreso de datos finalizado, ¡gracias!");
        scanner.close();
    }
}