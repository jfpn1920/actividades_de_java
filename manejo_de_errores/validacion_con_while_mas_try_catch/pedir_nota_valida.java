package validacion_con_while_mas_try_catch;
import java.util.Scanner;
import java.util.InputMismatchException;
public class pedir_nota_valida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota = -1;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print("ingrese una nota del 0 al 10: ");
                nota = scanner.nextDouble();
                if (nota >= 0 && nota <= 10) {
                    valido = true;
                } else {
                    System.out.println("error: La nota debe estar entre 0 y 10.");
                }
            } catch (InputMismatchException e) {
                System.out.println("error: debe ingresar un numero valido.");
                scanner.next(); 
            }
        }
        System.out.println("nota registrada correctamente: " + nota);
        scanner.close();
    }
}