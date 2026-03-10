package uso_del_finally;
import java.util.Scanner;
public class sistema_con_menu_y_finally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        try {
            System.out.println("sistema de menu");
            System.out.println("1. saludar");
            System.out.println("2. mostrar fecha simulada");
            System.out.println("3. salir");
            System.out.print("seleccione una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("hola, bienvenido al sistema.");
                    break;
                case 2:
                    System.out.println("hoy es un buen día para programar en Java.");
                    break;
                case 3:
                    System.out.println("saliendo del sistema...");
                    break;
                default:
                    System.out.println("opcion no valida.");
            }
        } catch (Exception e) {
            System.out.println("error: debe ingresar un numero valido.");
        } finally {
            System.out.println("el sistema ha finalizado la ejecucion del menu.");
            scanner.close();
        }
    }
}