package uso_del_finally;
import java.util.Scanner;
import java.util.InputMismatchException;
public class finally_en_lectura_de_datos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese su edad: ");
            int edad = scanner.nextInt();
            System.out.println("su edad es: " + edad);
        } catch (InputMismatchException e) {
            System.out.println("error: debe ingresar un numero valido para la edad.");
        } finally {
            System.out.println("finalizando lectura de datos del usuario.");
            scanner.close();
            System.out.println("recurso scanner cerrado correctamente.");
        }
    }
}