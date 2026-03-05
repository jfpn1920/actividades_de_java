package if_basico;
import java.util.Scanner;
public class pedir_un_numero_y_verificar_si_es_negativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        double numero = scanner.nextDouble();
        if (numero < 0) {
            System.out.println("el numero es negativo.");
        }
        scanner.close();
    }
}