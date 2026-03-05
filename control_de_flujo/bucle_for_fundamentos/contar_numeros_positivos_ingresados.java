package bucle_for_fundamentos;
import java.util.Scanner;
public class contar_numeros_positivos_ingresados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿cuantos numeros desea ingresar? ");
        int cantidad = scanner.nextInt();
        int positivos = 0;
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("ingrese el numero " + i + ": ");
            int numero = scanner.nextInt();
            if (numero > 0) {
                positivos++;
            }
        }
        System.out.println("cantidad de numeros positivos ingresados: " + positivos);
        scanner.close();
    }
}