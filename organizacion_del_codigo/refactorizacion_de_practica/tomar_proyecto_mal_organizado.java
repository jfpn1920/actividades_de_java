package refactorizacion_de_practica;
import java.util.Scanner;
public class tomar_proyecto_mal_organizado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese nombre del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.print("ingrese nota final: ");
        double nota = scanner.nextDouble();
        if (nota >= 3.0) {
            System.out.println(nombre + " aprobo con nota " + nota);
        } else {
            System.out.println(nombre + " reprobo con nota " + nota);
        }
        scanner.close();
    }
}