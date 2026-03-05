package if_mas_else;
import java.util.Scanner;
public class verificar_si_un_numero_es_par_o_impar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("el numero es par.");
        } else {
            System.out.println("el numero es impar.");
        }
        scanner.close();
    }
}