package nivel_de_practica;
import java.util.Scanner;
public class sistema_de_notas_con_validacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;
        double suma = 0;
        int cantidad = 3;
        int i = 1;
        System.out.println("sistema de notas");
        while (i <= cantidad) {
            System.out.print("ingrese la nota " + i + " (0 - 5): ");
            nota = scanner.nextDouble();
            if (nota < 0 || nota > 5) {
                System.out.println("nota invalida, intente nuevamente.");
                continue;
            }
            suma += nota;
            i++;
        }
        double promedio = suma / cantidad;
        System.out.println("promedio final: " + promedio);
        if (promedio >= 3) {
            System.out.println("estado: aprobado");
        } else {
            System.out.println("estado: reprobado");
        }
        scanner.close();
    }
}