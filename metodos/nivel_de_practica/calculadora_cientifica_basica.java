package nivel_de_practica;
import java.util.Scanner;
public class calculadora_cientifica_basica {
    public static void mostrarMenu() {
        System.out.println("\n calculadra cientifica ");
        System.out.println("1. sumar");
        System.out.println("2. restar");
        System.out.println("3. multiplicar");
        System.out.println("4. dividir");
        System.out.println("5. potencia");
        System.out.println("6. raiz cuadrada");
        System.out.println("7. salir");
        System.out.print("seleccione una opcion: ");
    }
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
    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
    public static double raizCuadrada(double numero) {
        if (numero < 0) {
            System.out.println("no se puede calcular raiz de numero negativo.");
            return 0;
        }
        return Math.sqrt(numero);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            double num1, num2, resultado;
            switch (opcion) {
                case 1:
                    System.out.print("ingrese el primer numero: ");
                    num1 = scanner.nextDouble();
                    System.out.print("ingrese el segundo numero: ");
                    num2 = scanner.nextDouble();
                    resultado = sumar(num1, num2);
                    System.out.println("resultado: " + resultado);
                    break;
                case 2:
                    System.out.print("ingrese el primer numero: ");
                    num1 = scanner.nextDouble();
                    System.out.print("ingrese el segundo numero: ");
                    num2 = scanner.nextDouble();
                    resultado = restar(num1, num2);
                    System.out.println("resultado: " + resultado);
                    break;
                case 3:
                    System.out.print("ingrese el primer numero: ");
                    num1 = scanner.nextDouble();
                    System.out.print("ingrese el segundo numero: ");
                    num2 = scanner.nextDouble();
                    resultado = multiplicar(num1, num2);
                    System.out.println("resultado: " + resultado);
                    break;
                case 4:
                    System.out.print("ingrese el primer numero: ");
                    num1 = scanner.nextDouble();
                    System.out.print("ingrese el segundo numero: ");
                    num2 = scanner.nextDouble();
                    resultado = dividir(num1, num2);
                    System.out.println("resultado: " + resultado);
                    break;
                case 5:
                    System.out.print("ingrese la base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("ingrese el exponente: ");
                    num2 = scanner.nextDouble();
                    resultado = potencia(num1, num2);
                    System.out.println("resultado: " + resultado);
                    break;
                case 6:
                    System.out.print("ingrese el numero: ");
                    num1 = scanner.nextDouble();
                    resultado = raizCuadrada(num1);
                    System.out.println("resultado: " + resultado);
                    break;
                case 7:
                    System.out.println("saliendo de la calculadora...");
                    break;
                default:
                    System.out.println("opcion invalida.");
            }
        } while (opcion != 7);
        scanner.close();
    }
}