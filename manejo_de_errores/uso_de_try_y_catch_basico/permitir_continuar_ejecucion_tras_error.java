package uso_de_try_y_catch_basico;
import java.util.Scanner;
public class permitir_continuar_ejecucion_tras_error {
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
        }
        System.out.println("el programa continua ejecutandose normalmente.");
        System.out.println("fin del programa.");
        scanner.close();
    }
}