package uso_de_try_y_catch_basico;
import java.util.Scanner;
import java.util.InputMismatchException;
public class manejar_error_en_suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese el primer numero: ");
            int num1 = scanner.nextInt();
            System.out.print("ingrese el segundo numero: ");
            int num2 = scanner.nextInt();
            int suma = num1 + num2;
            System.out.println("la suma es: " + suma);
        } catch (InputMismatchException e) {
            System.out.println("error: debe ingresar solo numeros enteros.");
        } 
        scanner.close();
    }
}