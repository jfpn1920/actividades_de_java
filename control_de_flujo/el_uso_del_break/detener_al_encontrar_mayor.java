package el_uso_del_break;
import java.util.Scanner;
public class detener_al_encontrar_mayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        while (true) {
            System.out.print("ingrese un numero: ");
            numero = scanner.nextInt();
            if (numero > 100) {
                System.out.println("numero mayor a 100 detectado, programa detenido.");
                break; 
            }
            System.out.println("numero valido: " + numero);
        }
        scanner.close();
    }
}