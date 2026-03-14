package buenas_practicas_en_consola;
import java.util.Scanner;
public class separar_logica_en_metodos {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int numero1 = pedirNumero("ingrese el primer numero: ");
        int numero2 = pedirNumero("ingrese el segundo numero: ");
        int resultado = sumar(numero1, numero2);
        mostrarResultado(resultado);
        scanner.close();
    }
    public static int pedirNumero(String mensaje) {
        System.out.print(mensaje);
        int numero = scanner.nextInt();
        return numero;
    }
    public static int sumar(int a, int b) {
        return a + b;
    }
    public static void mostrarResultado(int resultado) {
        System.out.println("el resultado de la suma es: " + resultado);
    }
}