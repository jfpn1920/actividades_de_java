package uso_del_continue;
import java.util.Scanner;
public class mostrar_solo_valores_validos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        for (int i = 1; i <= 5; i++) {
            System.out.print("ingrese un numero entre 1 y 10: ");
            numero = scanner.nextInt();
            if (numero < 1 || numero > 10) {
                System.out.println("valor invalido, se ignora.");
                continue; 
            }
            System.out.println("valor valido: " + numero);
        }
        scanner.close();
    }
}