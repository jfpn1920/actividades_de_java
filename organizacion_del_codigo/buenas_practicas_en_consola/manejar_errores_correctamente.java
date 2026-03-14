package buenas_practicas_en_consola;
import java.util.Scanner;
import java.util.InputMismatchException;
public class manejar_errores_correctamente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese un numero entero: ");
            int numero = scanner.nextInt();
            System.out.println("el numero ingresado es: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("error: debe ingresar un numero valido.");
        }
        scanner.close();
    }
}