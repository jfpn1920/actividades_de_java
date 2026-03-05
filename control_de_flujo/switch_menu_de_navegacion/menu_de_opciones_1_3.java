package switch_menu_de_navegacion;
import java.util.Scanner;
public class menu_de_opciones_1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("menu de opciones");
        System.out.println("1. saludar");
        System.out.println("2. mostrar fecha");
        System.out.println("3. salir");
        System.out.print("seleccione una opcion: ");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("hola, bienvenido al sistema.");
                break;
            case 2:
                System.out.println("hoy es un gran dia para programar.");
                break;
            case 3:
                System.out.println("saliendo del sistema...");
                break;
            default:
                System.out.println("opcion no valida.");
        }
        scanner.close();
    }
}