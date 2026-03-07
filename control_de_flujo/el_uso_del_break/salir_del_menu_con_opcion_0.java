package el_uso_del_break;
import java.util.Scanner;
public class salir_del_menu_con_opcion_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        while (true) {
            System.out.println("\n menu de consola");
            System.out.println("1. saludar");
            System.out.println("2. mostrar mensaje");
            System.out.println("3. realizar operacion simple");
            System.out.println("0. salir");
            System.out.print("seleccione una opcion: ");
            opcion = scanner.nextInt();
            if (opcion == 0) {
                System.out.println("saliendo del programa...");
                break; 
            }
            switch (opcion) {
                case 1:
                    System.out.println("Hola, bienvenido.");
                    break;
                case 2:
                    System.out.println("este es un mensaje.");
                    break;
                case 3:
                    System.out.println("operacion simple: 5 + 5 = " + (5 + 5));
                    break;
                default:
                    System.out.println("opcion invalida.");
            }
        }
        scanner.close();
    }
}