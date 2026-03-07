package uso_del_continue;
import java.util.Scanner;
public class ignorar_valores_mayores_a_100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        for (int i = 1; i <= 5; i++) {
            System.out.print("ingrese un numero: ");
            numero = scanner.nextInt();
            if (numero > 100) {
                System.out.println("valor mayor a 100 ignorado.");
                continue; 
            }
            System.out.println("numero aceptado: " + numero);
        }
        scanner.close();
    }
}