package bucle_do_while;
import java.util.Scanner;
public class mostrar_menu_hasta_elegir_salir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n menu de consola");
            System.out.println("1. saludar");
            System.out.println("2. mostrar informacion");
            System.out.println("3. realizar operacion");
            System.out.println("4. salir");
            System.out.print("seleccione una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("¡hola! bienvenido al menu.");
                    break;
                case 2:
                    System.out.println("mostrando informacion.");
                    break;
                case 3:
                    System.out.println("ejecutando operacion.");
                    break;
                case 4:
                    System.out.println("saliendo del menu.");
                    break;
                default:
                    System.out.println("opcion invalida, intente de nuevo.");
            }
        } while (opcion != 4);
        scanner.close();
    }
}