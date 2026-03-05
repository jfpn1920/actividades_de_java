package if_basico;
import java.util.Scanner;
public class pedir_salario_y_verificar_si_es_mayor_a_2_millones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese su salario: ");
        double salario = scanner.nextDouble();
        if (salario > 2000000) {
            System.out.println("el salario es mayor a 2 millones.");
        }
        scanner.close();
    }
}