package uso_de_try_y_catch_basico;
import java.util.Scanner;
public class capturar_conversion_incorrecta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese un numero: ");
            String texto = scanner.nextLine();
            int numero = Integer.parseInt(texto);
            System.out.println("el numero convertido es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("error: no se puede convertir el texto a numero.");
        }
        scanner.close();
    }
}