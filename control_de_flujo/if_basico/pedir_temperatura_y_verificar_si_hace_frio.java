package if_basico;
import java.util.Scanner;
public class pedir_temperatura_y_verificar_si_hace_frio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese la temperatura en grados celsius: ");
        double temperatura = scanner.nextDouble();
        if (temperatura < 20) {
            System.out.println("hace frio.");
        }
        scanner.close();
    }
}