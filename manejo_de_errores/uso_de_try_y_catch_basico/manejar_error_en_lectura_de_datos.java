package uso_de_try_y_catch_basico;
import java.util.Scanner;
import java.util.InputMismatchException;
public class manejar_error_en_lectura_de_datos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese su edad: ");
            int edad = scanner.nextInt();
            System.out.print("ingrese su altura en metros: ");
            double altura = scanner.nextDouble();
            System.out.println("edad: " + edad);
            System.out.println("altura: " + altura + " metros");
        } catch (InputMismatchException e) {
            System.out.println("error: el tipo de dato ingresado no es valido.");
        }
        scanner.close();
    }
}