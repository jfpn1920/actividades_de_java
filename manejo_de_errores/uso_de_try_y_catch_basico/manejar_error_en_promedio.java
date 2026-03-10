package uso_de_try_y_catch_basico;
import java.util.Scanner;
import java.util.InputMismatchException;
public class manejar_error_en_promedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese el primer numero: ");
            double num1 = scanner.nextDouble();
            System.out.print("ingrese el segundo numero: ");
            double num2 = scanner.nextDouble();
            System.out.print("ingrese el tercer numero: ");
            double num3 = scanner.nextDouble();
            double promedio = (num1 + num2 + num3) / 3;
            System.out.println("el promedio es: " + promedio);
        } catch (InputMismatchException e) {
            System.out.println("error: debe ingresar unicamente numeros validos.");
        }
        scanner.close();
    }
}