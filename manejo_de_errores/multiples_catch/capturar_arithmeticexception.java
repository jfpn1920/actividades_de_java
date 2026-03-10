package multiples_catch;
import java.util.Scanner;
import java.util.InputMismatchException;
public class capturar_arithmeticexception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese el primer numero: ");
            int num1 = scanner.nextInt();
            System.out.print("ingrese el segundo numero: ");
            int num2 = scanner.nextInt();
            int resultado = num1 / num2;
            System.out.println("resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("error: no se puede dividir entre cero.");
        } catch (InputMismatchException e) {
            System.out.println("error: debe ingresar solo numeros enteros.");
        }
        scanner.close();
    }
}