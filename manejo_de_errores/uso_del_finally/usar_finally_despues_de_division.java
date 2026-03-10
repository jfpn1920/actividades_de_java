package uso_del_finally;
import java.util.Scanner;
public class usar_finally_despues_de_division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese el primer numero: ");
            int num1 = scanner.nextInt();
            System.out.print("ingrese el segundo numero: ");
            int num2 = scanner.nextInt();
            int resultado = num1 / num2;
            System.out.println("resultado de la division: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("error: no se puede dividir entre cero.");
        } finally {
            System.out.println("el bloque finally siempre se ejecuta.");
        }
        scanner.close();
    }
}