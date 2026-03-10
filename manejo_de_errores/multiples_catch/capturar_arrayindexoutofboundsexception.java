package multiples_catch;
import java.util.Scanner;
import java.util.InputMismatchException;
public class capturar_arrayindexoutofboundsexception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {10, 20, 30, 40, 50};
        try {
            System.out.print("ingrese el indice del arreglo: ");
            int indice = scanner.nextInt();
            System.out.println("el valor en esa posicion es: " + numeros[indice]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error: el indice esta fuera del rango del arreglo.");
        } catch (InputMismatchException e) {
            System.out.println("error: debe ingresar un numero entero valido.");
        }
        scanner.close();
    }
}