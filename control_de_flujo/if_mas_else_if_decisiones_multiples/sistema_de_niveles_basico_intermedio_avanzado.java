package if_mas_else_if_decisiones_multiples;
import java.util.Scanner;
public class sistema_de_niveles_basico_intermedio_avanzado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese su puntaje (0 - 100): ");
        int puntaje = scanner.nextInt();
        if (puntaje >= 0 && puntaje <= 49) {
            System.out.println("nivel: basico");
        } 
        else if (puntaje >= 50 && puntaje <= 79) {
            System.out.println("nivel: intermedio");
        } 
        else if (puntaje >= 80 && puntaje <= 100) {
            System.out.println("nivel: avanzado");
        } 
        else {
            System.out.println("puntaje invalido.");
        }
        scanner.close();
    }
}