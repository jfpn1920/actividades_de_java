package if_mas_else;
import java.util.Scanner;
public class verificar_si_un_numero_es_divisible_por_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        int numero = scanner.nextInt();
        if (numero % 10 == 0) {
            System.out.println("el numero es divisible por 10.");
        } else {
            System.out.println("el numero no es divisible por 10.");
        }
        scanner.close();
    }
}