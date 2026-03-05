package if_mas_else;
import java.util.Scanner;
public class determinar_si_un_numero_es_multiplo_de_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        int numero = scanner.nextInt();
        if (numero % 3 == 0) {
            System.out.println("el numero es multiplo de 3.");
        } else {
            System.out.println("el numero no es multiplo de 3.");
        }
        scanner.close();
    }
}