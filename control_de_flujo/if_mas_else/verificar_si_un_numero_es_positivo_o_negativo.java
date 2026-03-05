package if_mas_else;
import java.util.Scanner;
public class verificar_si_un_numero_es_positivo_o_negativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        double numero = scanner.nextDouble();
        if (numero >= 0) {
            System.out.println("el numero es positivo.");
        } else {
            System.out.println("el numero es negativo.");
        }
        scanner.close();
    }
}