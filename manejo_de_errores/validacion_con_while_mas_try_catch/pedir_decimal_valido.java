package validacion_con_while_mas_try_catch;
import java.util.Scanner;
import java.util.InputMismatchException;
public class pedir_decimal_valido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print("ingrese un numero decimal: ");
                numero = scanner.nextDouble();
                valido = true; 
            } catch (InputMismatchException e) {
                System.out.println("error: debe ingresar un numero decimal valido.");
                scanner.next(); 
            }
        }
        System.out.println("numero decimal ingresado correctamente: " + numero);
        scanner.close();
    }
}