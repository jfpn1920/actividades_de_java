package validacion_con_while_mas_try_catch;
import java.util.Scanner;
import java.util.InputMismatchException;
public class validar_rango_con_excepciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print("ingrese un numero entre 1 y 100: ");
                numero = scanner.nextInt();
                if (numero >= 1 && numero <= 100) {
                    valido = true;
                } else {
                    System.out.println("error: el numero debe estar entre 1 y 100.");
                }
            } catch (InputMismatchException e) {
                System.out.println("error: debe ingresar un numero entero valido.");
                scanner.next();
            }
        }
        System.out.println("numero valido ingresado: " + numero);
        scanner.close();
    }
}