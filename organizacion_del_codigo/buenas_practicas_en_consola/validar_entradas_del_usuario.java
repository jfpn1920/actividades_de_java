package buenas_practicas_en_consola;
import java.util.Scanner;
public class validar_entradas_del_usuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.print("ingrese un numero entero: ");
        while (!scanner.hasNextInt()) {
            System.out.println("entrada invalida, por favor ingrese un numero entero.");
            System.out.print("intente nuevamente: ");
            scanner.next(); 
        }
        numero = scanner.nextInt();
        System.out.println("el numero ingresado es: " + numero);
        scanner.close();
    }
}