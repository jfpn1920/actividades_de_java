package uso_del_continue;
import java.util.Scanner;
public class saltar_si_es_cero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        for (int i = 1; i <= 5; i++) {
            System.out.print("ingrese un numero: ");
            numero = scanner.nextInt();
            if (numero == 0) {
                System.out.println("el numero 0 se omite.");
                continue; 
            }
            System.out.println("numero ingresado: " + numero);
        }
        scanner.close();
    }
}