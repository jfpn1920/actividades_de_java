package if_basico;
import java.util.Scanner;
public class pedir_numero_y_verificar_si_es_multiplo_de_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        int numero = scanner.nextInt();
        if (numero % 5 == 0) {
            System.out.println("el numero es multiplo de 5.");
        }
        scanner.close();
    }
}