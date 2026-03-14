package nivel_de_practica;
import java.util.ArrayList;
import java.util.Scanner;
public class sistema_de_gestion_de_estudiantes {
    static ArrayList<String> estudiantes = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        mostrarMenu();
    }
    public static void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n sistema de gestion de estudiantes ");
            System.out.println("1. registrar estudiante");
            System.out.println("2. mostrar estudiantes");
            System.out.println("3. salir");
            System.out.print("seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcion) {
                case 1:
                    registrarEstudiante();
                    break;
                case 2:
                    mostrarEstudiantes();
                    break;
                case 3:
                    System.out.println("saliendo del sistema...");
                    break;
                default:
                    System.out.println("opcion invalida.");
            }
        } while (opcion != 3);
    }
    public static void registrarEstudiante() {
        System.out.print("ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        estudiantes.add(nombre);
        System.out.println("estudiante registrado correctamente.");
    }
    public static void mostrarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("no hay estudiantes registrados.");
            return;
        }
        System.out.println("\n lista de estudiantes:");
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println((i + 1) + ". " + estudiantes.get(i));
        }
    }
}