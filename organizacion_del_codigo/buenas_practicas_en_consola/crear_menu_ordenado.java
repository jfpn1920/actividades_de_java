package buenas_practicas_en_consola;
import java.util.Scanner;
public class crear_menu_ordenado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("menu pricipal");
        System.out.println("1. saludar");
        System.out.println("2. mostrar fecha");
        System.out.println("3. salir");
        System.out.println("==========================");
        System.out.print("seleccione una opcion: ");
        opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("hola, bienvenido al programa.");
                break;
            case 2:
                System.out.println("hoy es un buen dia para programar.");
                break;
            case 3:
                System.out.println("saliendo del programa...");
                break;
            default:
                System.out.println("opcion no valida.");
        }
        scanner.close();
    }
}