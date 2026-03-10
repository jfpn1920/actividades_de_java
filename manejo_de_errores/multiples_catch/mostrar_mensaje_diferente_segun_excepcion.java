package multiples_catch;
import java.util.Scanner;
import java.util.InputMismatchException;
public class mostrar_mensaje_diferente_segun_excepcion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {5, 10, 15, 20};
        try {
            System.out.print("ingrese un indice del arreglo: ");
            int indice = scanner.nextInt();
            System.out.print("ingrese un numero para dividir: ");
            int divisor = scanner.nextInt();
            int resultado = numeros[indice] / divisor;
            System.out.println("resultado: " + resultado);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("mensaje: el indice que ingresaste no existe en el arreglo.");
        } catch (ArithmeticException e) {
            System.out.println("mensaje: no es posible dividir entre cero.");
        } catch (InputMismatchException e) {
            System.out.println("mensaje: debes ingresar unicamente numeros.");
        }
        scanner.close();
    }
}