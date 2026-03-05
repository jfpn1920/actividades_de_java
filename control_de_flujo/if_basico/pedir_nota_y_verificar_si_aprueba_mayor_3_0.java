package if_basico;
import java.util.Scanner;
public class pedir_nota_y_verificar_si_aprueba_mayor_3_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese la nota: ");
        double nota = scanner.nextDouble();
        if (nota >= 3.0) {
            System.out.println("el estudiante aprueba.");
        }
        scanner.close();
    }
}