package multiples_catch;
import java.util.Scanner;
import java.util.InputMismatchException;
public class comparar_catch_especifico_vs_general {
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
            System.out.println("catch especifico: no se puede dividir entre cero.");
        } catch (InputMismatchException e) {
            System.out.println("catch especifico: debe ingresar solo numeros.");
        } catch (Exception e) {
            System.out.println("catch general: ocurrio un error inesperado.");
        }
        scanner.close();
    }
}