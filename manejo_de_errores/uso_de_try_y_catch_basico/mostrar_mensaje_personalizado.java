package uso_de_try_y_catch_basico;
import java.util.Scanner;
public class mostrar_mensaje_personalizado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese el primer numero: ");
            int num1 = scanner.nextInt();
            System.out.print("ingrese el segundo numero: ");
            int num2 = scanner.nextInt();
            int resultado = num1 / num2;
            System.out.println("el resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("error personalizado: no puedes dividir un numero entre cero.");
        } catch (Exception e) {
            System.out.println("error personalizado: ocurrio un problema con los datos ingresados.");
        }
        scanner.close();
    }
}