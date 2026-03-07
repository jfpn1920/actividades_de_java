package bucle_do_while;
import java.util.Scanner;
public class simular_repeticion_de_operaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;
        System.out.println("simulacion de repeticion de operaciones");
        do {
            System.out.println("\nseleccione una operacion:");
            System.out.println("1. suma");
            System.out.println("2. resta");
            System.out.println("3. multiplicación");
            System.out.println("4. división");
            System.out.println("5. salir");
            System.out.print("opcion: ");
            opcion = scanner.nextInt();
            if (opcion >= 1 && opcion <= 4) {
                System.out.print("ingrese el primer numero: ");
                num1 = scanner.nextDouble();
                System.out.print("ingrese el segundo numero: ");
                num2 = scanner.nextDouble();
                switch (opcion) {
                    case 1:
                        resultado = num1 + num2;
                        System.out.println("resultado: " + resultado);
                        break;
                    case 2:
                        resultado = num1 - num2;
                        System.out.println("resultado: " + resultado);
                        break;
                    case 3:
                        resultado = num1 * num2;
                        System.out.println("resultado: " + resultado);
                        break;
                    case 4:
                        if (num2 != 0) {
                            resultado = num1 / num2;
                            System.out.println("resultado: " + resultado);
                        } else {
                            System.out.println("error: division por cero.");
                        }
                        break;
                }
            } else if (opcion != 5) {
                System.out.println("opcion invalida, intente nuevamente.");
            }
        } while (opcion != 5);
        System.out.println("programa finalizado, ¡gracias por usar la calculadora!");
        scanner.close();
    }
}