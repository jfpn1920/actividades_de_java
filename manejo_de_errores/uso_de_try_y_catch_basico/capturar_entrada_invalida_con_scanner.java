package uso_de_try_y_catch_basico;
import java.util.Scanner;
import java.util.InputMismatchException;
public class capturar_entrada_invalida_con_scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese un numero entero: ");
            int numero = scanner.nextInt();
            System.out.println("el numero ingresado es: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("error: debe ingresar un numero entero valido.");
        }
        scanner.close();
    }
}