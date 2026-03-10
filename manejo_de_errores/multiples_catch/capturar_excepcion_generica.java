package multiples_catch;
import java.util.Scanner;
import java.util.InputMismatchException;
public class capturar_excepcion_generica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {10, 20, 30};
        try {
            System.out.print("ingrese un indice del arreglo: ");
            int indice = scanner.nextInt();
            System.out.print("ingrese un numero para dividir: ");
            int divisor = scanner.nextInt();
            int resultado = numeros[indice] / divisor;
            System.out.println("resultado: " + resultado);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error: el indice ingresado esta fuera del arreglo.");
        } catch (ArithmeticException e) {
            System.out.println("error: no se puede dividir entre cero.");
        } catch (InputMismatchException e) {
            System.out.println("error: debe ingresar valores numericos.");
        } catch (Exception e) {
            System.out.println("error general: ocurrio una excepcion inesperada.");
        }
        scanner.close();
    }
}