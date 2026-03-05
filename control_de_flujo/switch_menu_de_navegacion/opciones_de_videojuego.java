package switch_menu_de_navegacion;
import java.util.Scanner;
public class opciones_de_videojuego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("menu del juego");
        System.out.println("1. nuevo juego");
        System.out.println("2. cargar juego");
        System.out.println("3. ajustes");
        System.out.println("4. salir");
        System.out.print("seleccione una opcion: ");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("iniciando un nuevo juego...");
                break;
            case 2:
                System.out.println("cargando partida guardada...");
                break;
            case 3:
                System.out.println("abriendo menú de ajustes...");
                break;
            case 4:
                System.out.println("saliendo del juego...");
                break;
            default:
                System.out.println("opcion invalida, debe ser entre 1 y 4.");
        }
        scanner.close();
    }
}