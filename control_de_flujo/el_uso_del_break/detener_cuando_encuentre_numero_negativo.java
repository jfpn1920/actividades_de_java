package el_uso_del_break;
import java.util.Scanner;
public class detener_cuando_encuentre_numero_negativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        while (true) {
            System.out.print("ingrese un numero: ");
            numero = scanner.nextInt();
            if (numero < 0) {
                System.out.println("numero negativo detectado, programa detenido.");
                break; 
            }
            System.out.println("numero ingresado: " + numero);
        }
        scanner.close();
    }
}