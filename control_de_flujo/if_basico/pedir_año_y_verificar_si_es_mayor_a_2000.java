package if_basico;
import java.util.Scanner;
public class pedir_año_y_verificar_si_es_mayor_a_2000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un año: ");
        int anio = scanner.nextInt();
        if (anio > 2000) {
            System.out.println("el año es mayor a 2000.");
        }
        scanner.close();
    }
}