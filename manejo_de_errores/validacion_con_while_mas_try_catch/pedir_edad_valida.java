package validacion_con_while_mas_try_catch;
import java.util.Scanner;
import java.util.InputMismatchException;
public class pedir_edad_valida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad = -1;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print("ingrese su edad: ");
                edad = scanner.nextInt();
                if (edad < 0) {
                    System.out.println("error: la edad no puede ser negativa.");
                } else {
                    valido = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("error: debe ingresar un numero valido.");
                scanner.next(); 
            }
        }
        System.out.println("edad registrada correctamente: " + edad);
        scanner.close();
    }
}