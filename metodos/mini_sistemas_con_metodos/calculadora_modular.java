package mini_sistemas_con_metodos;
import java.util.Scanner;
public class calculadora_modular {
    public static double sumar(double a, double b) {
        return a + b;
    }
    public static double restar(double a, double b) {
        return a - b;
    }
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("no se puede dividir entre cero.");
            return 0;
        }
        return a / b;
    }
    public static void mostrarMenu() {
        System.out.println("\n calculadora ");
        System.out.println("1. sumar");
        System.out.println("2. restar");
        System.out.println("3. multiplicar");
        System.out.println("4. dividir");
        System.out.println("5. salir");
        System.out.print("seleccione una opcion: ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            if (opcion >= 1 && opcion <= 4) {
                System.out.print("ingrese el primer numero: ");
                double num1 = scanner.nextDouble();
                System.out.print("ingrese el segundo numero: ");
                double num2 = scanner.nextDouble();
                double resultado = 0;
                switch (opcion) {
                    case 1:
                        resultado = sumar(num1, num2);
                        break;
                    case 2:
                        resultado = restar(num1, num2);
                        break;
                    case 3:
                        resultado = multiplicar(num1, num2);
                        break;
                    case 4:
                        resultado = dividir(num1, num2);
                        break;
                }
                System.out.println("resultado: " + resultado);
            }
        } while (opcion != 5);
        System.out.println("programa finalizado.");
        scanner.close();
    }
}