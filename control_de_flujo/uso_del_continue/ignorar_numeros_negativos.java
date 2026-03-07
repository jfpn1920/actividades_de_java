package uso_del_continue;
import java.util.Scanner;
public class ignorar_numeros_negativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        for (int i = 1; i <= 5; i++) {
            System.out.print("ingrese un numero: ");
            numero = scanner.nextInt();
            if (numero < 0) {
                System.out.println("numero negativo ignorado.");
                continue; 
            }
            System.out.println("numero valido: " + numero);
        }
        scanner.close();
    }
}