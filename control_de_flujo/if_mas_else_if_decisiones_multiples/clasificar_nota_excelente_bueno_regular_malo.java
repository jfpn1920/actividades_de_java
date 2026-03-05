package if_mas_else_if_decisiones_multiples;
import java.util.Scanner;
public class clasificar_nota_excelente_bueno_regular_malo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese la nota: ");
        double nota = scanner.nextDouble();
        if (nota >= 4.5) {
            System.out.println("excelente");
        } else if (nota >= 4.0) {
            System.out.println("bueno");
        } else if (nota >= 3.0) {
            System.out.println("regular");
        } else {
            System.out.println("malo");
        }
        scanner.close();
    }
}