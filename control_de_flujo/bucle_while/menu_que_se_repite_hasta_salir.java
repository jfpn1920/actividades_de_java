package bucle_while;

import java.util.Scanner;
public class menu_que_se_repite_hasta_salir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 4) { // Mientras no seleccione salir
            System.out.println("\n menu de navegacion");
            System.out.println("1. saludar");
            System.out.println("2. mostrar fecha");
            System.out.println("3. realizar operacion");
            System.out.println("4. salir");
            System.out.print("seleccione una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("hola bienvenido al menu.");
                    break;
                case 2:
                    System.out.println("mostrando fecha: 05/03/2026");
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
        }
        scanner.close();
    }
}