package if_mas_else_if_decisiones_multiples;
import java.util.Scanner;
public class clasificar_numero_positivo_negativo_cero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        int numero = scanner.nextInt();
        if (numero > 0) {
            System.out.println("el numero es positivo.");
        } else if (numero < 0) {
            System.out.println("el numero es negativo.");
        } else {
            System.out.println("el numero es cero.");
        }
        scanner.close();
    }
}