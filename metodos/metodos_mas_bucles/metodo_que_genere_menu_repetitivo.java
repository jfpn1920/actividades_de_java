package metodos_mas_bucles;
import java.util.Scanner;
public class metodo_que_genere_menu_repetitivo {
    public static void mostrarMenu(Scanner scanner) {
        int opcion;
        do {
            System.out.println("\n menu consola ");
            System.out.println("1. saludar");
            System.out.println("2. mostrar mensaje");
            System.out.println("3. salir");
            System.out.print("seleccione una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("hola, bienvenido al programa.");
                    break;
                case 2:
                    System.out.println("este es un ejemplo de menú repetitivo.");
                    break;
                case 3:
                    System.out.println("saliendo del programa...");
                    break;
                default:
                    System.out.println("opcion no valida.");
            }
        } while (opcion != 3);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        mostrarMenu(scanner);
        scanner.close();
    }
}