package buenas_practicas_en_consola;
import java.util.Scanner;
public class usar_mensajes_claros_en_consola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("programa para sumar 2 numeros");
        System.out.print("por favor, ingrese el primer numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("por favor, ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();
        int resultado = numero1 + numero2;
        System.out.println("el resultado de la suma de " + numero1 + " + " + numero2 + " es: " + resultado);
        System.out.println("gracias por usar el programa.");
        scanner.close();
    }
}