package uso_de_try_y_catch_basico;
import java.util.Scanner;
import java.util.InputMismatchException;
public class manejar_multiples_intentos_simples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.print("ingrese un numero entero: ");
                numero = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("error: debe ingresar un numero valido, intente nuevamente.");
                scanner.next(); 
            }
        }
        System.out.println("numero ingresado correctamente: " + numero);
        scanner.close();
    }
}