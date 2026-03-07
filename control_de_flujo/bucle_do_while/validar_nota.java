package bucle_do_while;
import java.util.Scanner;
public class validar_nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;
        System.out.println("validar nota");
        do {
            System.out.print("ingrese una nota (0-5): ");
            nota = scanner.nextDouble();
            if (nota < 0 || nota > 5) {
                System.out.println("nota invalida, intente nuevamente.");
            }
        } while (nota < 0 || nota > 5);
        System.out.println("¡nota valida ingresada: " + nota + "!");
        scanner.close();
    }
}