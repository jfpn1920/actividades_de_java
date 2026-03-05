package bucle_for_fundamentos;
import java.util.Scanner;
public class mostrar_tabla_de_multiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese el numero para mostrar su tabla de multiplicar: ");
        int numero = scanner.nextInt();
        System.out.println("tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        scanner.close();
    }
}