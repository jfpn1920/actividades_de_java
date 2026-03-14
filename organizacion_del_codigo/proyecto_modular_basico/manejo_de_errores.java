package proyecto_modular_basico;
import java.util.Scanner;
public class manejo_de_errores {
    public static void main(String[] args) {
        int numero = leerNumero();
        System.out.println("el numero ingresado es: " + numero);
    }
    public static int leerNumero() {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print("ingrese un numero entero: ");
                numero = scanner.nextInt();
                valido = true; 
            } catch (Exception e) {
                System.out.println("error: debe ingresar un numero entero valido.");
                scanner.nextLine();
            }
        }
        scanner.close();
        return numero;
    }
}