package proyecto_modular_basico;
import java.util.Scanner;
public class menu_en_clase_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            mostrarMenu();
            System.out.print("seleccione una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    opcionSaludar();
                    break;
                case 2:
                    opcionMostrarFecha();
                    break;
                case 3:
                    System.out.println("saliendo del sistema...");
                    break;
                default:
                    System.out.println("opcion no valida.");
            }
        } while (opcion != 3);
        scanner.close();
    }
    public static void mostrarMenu() {
        System.out.println("\n menu pricipal ");
        System.out.println("1. saludar");
        System.out.println("2. mostrar mensaje");
        System.out.println("3. salir");
    }
    public static void opcionSaludar() {
        System.out.println("hola, bienvenido al sistema modular.");
    }
    public static void opcionMostrarFecha() {
        System.out.println("hoy es un buen dia para programar en java.");
    }
}