package multiples_catch;
import java.util.Scanner;
public class manejar_conversion_invalida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese un numero: ");
            String texto = scanner.nextLine();
            int numero = Integer.parseInt(texto);
            int resultado = 100 / numero;
            System.out.println("el resultado de 100 / " + numero + " es: " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("error: el valor ingresado no es un numero valido.");
        } catch (ArithmeticException e) {
            System.out.println("error: no se puede dividir entre cero.");
        }
        scanner.close();
    }
}