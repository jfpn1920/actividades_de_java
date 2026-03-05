package if_mas_else;
import java.util.Scanner;
public class determinar_si_una_nota_es_aprobada_o_reprobada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese la nota: ");
        double nota = scanner.nextDouble();
        if (nota >= 3.0) {
            System.out.println("la nota es aprobada.");
        } else {
            System.out.println("la nota es reprobada.");
        }
        scanner.close();
    }
}