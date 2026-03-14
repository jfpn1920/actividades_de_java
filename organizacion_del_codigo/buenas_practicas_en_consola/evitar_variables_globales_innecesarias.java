package buenas_practicas_en_consola;
import java.util.Scanner;
public class evitar_variables_globales_innecesarias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1 = pedirNumero(scanner, "ingrese el primer numero: ");
        int numero2 = pedirNumero(scanner, "ingrese el segundo numero: ");
        int resultado = sumar(numero1, numero2);
        System.out.println("la suma es: " + resultado);
        scanner.close();
    }
    public static int pedirNumero(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }
    public static int sumar(int a, int b) {
        return a + b;
    }
}