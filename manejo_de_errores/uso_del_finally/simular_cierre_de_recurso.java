package uso_del_finally;
import java.util.Scanner;
import java.util.InputMismatchException;
public class simular_cierre_de_recurso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese un numero entero: ");
            int numero = scanner.nextInt();
            System.out.println("el numero ingresado es: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("error: entrada invalida, debe ingresar un numero.");
        } finally {
            System.out.println("cerrando recurso scanner...");
            scanner.close();
            System.out.println("recurso cerrado correctamente.");
        }
    }
}