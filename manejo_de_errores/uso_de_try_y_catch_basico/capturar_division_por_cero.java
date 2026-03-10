package uso_de_try_y_catch_basico;
import java.util.Scanner;
public class capturar_division_por_cero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese el numerador: ");
            int numerador = scanner.nextInt();
            System.out.print("ingrese el denominador: ");
            int denominador = scanner.nextInt();
            int resultado = numerador / denominador;
            System.out.println("el resultado de la division es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("error: no se puede dividir entre cero.");
        }
        scanner.close();
    }
}