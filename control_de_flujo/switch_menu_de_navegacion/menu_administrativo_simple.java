package switch_menu_de_navegacion;
import java.util.Scanner;
public class menu_administrativo_simple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("menu administrativo");
        System.out.println("1. agregar usuario");
        System.out.println("2. eliminar usuario");
        System.out.println("3. mostrar lista de usuarios");
        System.out.println("4. salir");
        System.out.print("seleccione una opcion: ");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("funcion: agregar usuario seleccionada.");
                break;
            case 2:
                System.out.println("funcion: eliminar usuario seleccionada.");
                break;
            case 3:
                System.out.println("funcion: mostrar lista de usuarios seleccionada.");
                break;
            case 4:
                System.out.println("saliendo del sistema administrativo...");
                break;
            default:
                System.out.println("opcion invalida. debe ser entre 1 y 4.");
        }
        scanner.close();
    }
}