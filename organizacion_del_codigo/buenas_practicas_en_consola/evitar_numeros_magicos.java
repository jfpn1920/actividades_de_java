package buenas_practicas_en_consola;
import java.util.Scanner;
public class evitar_numeros_magicos {
    public static final int NOTA_MINIMA_APROBACION = 60;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese la nota del estudiante: ");
        int nota = scanner.nextInt();
        if (nota >= NOTA_MINIMA_APROBACION) {
            System.out.println("el estudiante ha aprobado.");
        } else {
            System.out.println("el estudiante ha reprobado.");
        }
        scanner.close();
    }
}