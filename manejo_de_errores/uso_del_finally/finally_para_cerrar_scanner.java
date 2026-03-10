package uso_del_finally;
import java.util.Scanner;
import java.util.InputMismatchException;
public class finally_para_cerrar_scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese un numero entero: ");
            int numero = scanner.nextInt();
            System.out.println("el numero ingresado es: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("error: debe ingresar un numero valido.");
        } finally {
            if (scanner != null) {
                scanner.close();
                System.out.println("scanner cerrado correctamente en el bloque finally.");
            }
        }
    }
}