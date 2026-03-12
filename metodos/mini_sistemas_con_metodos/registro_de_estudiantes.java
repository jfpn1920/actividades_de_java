package mini_sistemas_con_metodos;
import java.util.Scanner;
public class registro_de_estudiantes {
    public static void registrarEstudiantes(String[] estudiantes, Scanner scanner) {
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.print("ingrese el nombre del estudiante " + (i + 1) + ": ");
            estudiantes[i] = scanner.nextLine();
        }
    }
    public static void mostrarEstudiantes(String[] estudiantes) {
        System.out.println("\n lista de estudiantes registrados:");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println((i + 1) + ". " + estudiantes[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] estudiantes = new String[3];
        registrarEstudiantes(estudiantes, scanner);
        mostrarEstudiantes(estudiantes);
        scanner.close();
    }
}