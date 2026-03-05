package if_mas_else_if_decisiones_multiples;
import java.util.Scanner;
public class sistema_de_calificaciones_con_letras_a_b_c_d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese la nota (0 - 100): ");
        int nota = scanner.nextInt();
        if (nota >= 90 && nota <= 100) {
            System.out.println("calificacion: a");
        } 
        else if (nota >= 80) {
            System.out.println("calificacion: b");
        } 
        else if (nota >= 70) {
            System.out.println("calificacion: c");
        } 
        else if (nota >= 60) {
            System.out.println("calificacion: d");
        } 
        else if (nota >= 0) {
            System.out.println("calificacion: f");
        } 
        else {
            System.out.println("nota invalida.");
        }
        scanner.close();
    }
}