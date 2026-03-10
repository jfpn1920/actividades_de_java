package multiples_catch;
import java.util.Scanner;
import java.util.InputMismatchException;
public class capturar_inputmismatchexception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese un numero entero: ");
            int numero = scanner.nextInt();
            int resultado = 100 / numero;
            System.out.println("el resultado de 100 / " + numero + " es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("error: debe ingresar un numero entero valido.");
        } catch (ArithmeticException e) {
            System.out.println("error: no se puede dividir entre cero.");
        }
        scanner.close();
    }
}