package problemas_con_multiples_entradas;
import java.util.Scanner;
public class pedir_3_salarios_y_total {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double total = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("ingrese el salario " + i + ": ");
            double salario = entrada.nextDouble();
            total += salario;
        }
        System.out.println("\n el total de los 3 salarios es: " + total);
        entrada.close();
    }
}