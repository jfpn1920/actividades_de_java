package validacion_con_while_mas_try_catch;
import java.util.Scanner;
import java.util.InputMismatchException;
public class pedir_entero_hasta_correcto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print("ingrese un numero entero: ");
                numero = scanner.nextInt();
                valido = true; 
            } catch (InputMismatchException e) {
                System.out.println("error: debe ingresar un numero entero.");
                scanner.next(); 
            }
        }
        System.out.println("numero entero ingresado correctamente: " + numero);
        scanner.close();
    }
}