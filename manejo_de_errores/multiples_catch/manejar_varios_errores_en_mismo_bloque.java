package multiples_catch;
import java.util.Scanner;
import java.util.InputMismatchException;
public class manejar_varios_errores_en_mismo_bloque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {10, 20, 30, 40, 50};
        try {
            System.out.print("ingrese un indice del arreglo: ");
            int indice = scanner.nextInt();
            System.out.print("ingrese un numero para dividir: ");
            int divisor = scanner.nextInt();
            int resultado = numeros[indice] / divisor;
            System.out.println("resultado: " + resultado);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error: el indice esta fuera del rango del arreglo.");
        } catch (ArithmeticException e) {
            System.out.println("error: no se puede dividir entre cero.");
        } catch (InputMismatchException e) {
            System.out.println("error: debe ingresar valores numericos.");
        }
        scanner.close();
    }
}