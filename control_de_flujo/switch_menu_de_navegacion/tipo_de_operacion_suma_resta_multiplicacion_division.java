package switch_menu_de_navegacion;
import java.util.Scanner;
public class tipo_de_operacion_suma_resta_multiplicacion_division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese el primer numero: ");
        double num1 = scanner.nextDouble();
        System.out.print("ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();
        System.out.print("ingrese la operacion (+, -, *, /): ");
        char operador = scanner.next().charAt(0);
        double resultado;
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("resultado: " + resultado);
                } else {
                    System.out.println("error: division entre 0 no permitida.");
                }
                break;
            default:
                System.out.println("operador no valido.");
        }
        scanner.close();
    }
}