package if_mas_else;
import java.util.Scanner;
public class determinar_si_una_temperatura_es_alta_o_baja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese la temperatura en grados celsius: ");
        double temperatura = scanner.nextDouble();
        if (temperatura >= 30) {
            System.out.println("la temperatura es alta.");
        } else {
            System.out.println("la temperatura es baja.");
        }
        scanner.close();
    }
}