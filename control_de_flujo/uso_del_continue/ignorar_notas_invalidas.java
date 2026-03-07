package uso_del_continue;
import java.util.Scanner;
public class ignorar_notas_invalidas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;
        for (int i = 1; i <= 5; i++) {
            System.out.print("ingrese una nota: ");
            nota = scanner.nextDouble();
            if (nota < 0 || nota > 5) {
                System.out.println("nota invalida, se ignora.");
                continue; 
            }
            System.out.println("nota valida: " + nota);
        }
        scanner.close();
    }
}