package bucle_while;
import java.util.Scanner;
public class pedir_numero_hasta_que_sea_positivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.print("ingrese un numero positivo: ");
            numero = scanner.nextInt();
            if (numero <= 0) {
                System.out.println("numero no valido, debe ser positivo.");
            }
        } while (numero <= 0);
        System.out.println("numero aceptado: " + numero + "!");
        scanner.close();
    }
}