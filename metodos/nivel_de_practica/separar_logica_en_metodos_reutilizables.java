package nivel_de_practica;
import java.util.Scanner;
public class separar_logica_en_metodos_reutilizables {
    public static void mostrarMenu() {
        System.out.println("\n menu de calculadora ");
        System.out.println("1. sumar");
        System.out.println("2. restar");
        System.out.println("3. multiplicar");
        System.out.println("4. dividir");
        System.out.println("5. salir");
        System.out.print("seleccione una opcion: ");
    }
    public static double pedirNumero(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
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
    public static void mostrarResultado(double resultado) {
        System.out.println("resultado: " + resultado);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            if (opcion >= 1 && opcion <= 4) {
                double num1 = pedirNumero(scanner, "ingrese el primer numero: ");
                double num2 = pedirNumero(scanner, "ingrese el segundo numero: ");
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
                mostrarResultado(resultado);
            }
        } while (opcion != 5);
        System.out.println("saliendo del programa...");
        scanner.close();
    }
}