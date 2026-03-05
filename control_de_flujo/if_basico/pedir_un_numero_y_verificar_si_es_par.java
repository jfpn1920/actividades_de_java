package if_basico;
import java.util.Scanner;
public class pedir_un_numero_y_verificar_si_es_par {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("el numero es par.");
        }
        scanner.close();
    }
}