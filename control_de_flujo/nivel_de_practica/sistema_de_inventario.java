package nivel_de_practica;
import java.util.Scanner;
public class sistema_de_inventario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stock = 0;
        int opcion;
        int cantidad;
        do {
            System.out.println("\n sistema de inventario");
            System.out.println("1. agregar productos");
            System.out.println("2. ver inventario");
            System.out.println("3. retirar productos");
            System.out.println("4. salir");
            System.out.print("seleccione una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("ingrese cantidad a agregar: ");
                    cantidad = scanner.nextInt();
                    stock += cantidad;
                    System.out.println("productos agregados, stock actual: " + stock);
                    break;
                case 2:
                    System.out.println("stock actual: " + stock);
                    break;
                case 3:
                    System.out.print("ingrese cantidad a retirar: ");
                    cantidad = scanner.nextInt();
                    if (cantidad <= stock) {
                        stock -= cantidad;
                        System.out.println("productos retirados, stock actual: " + stock);
                    } else {
                        System.out.println("no hay suficiente stock.");
                    }
                    break;
                case 4:
                    System.out.println("saliendo del sistema de inventario...");
                    break;
                default:
                    System.out.println("opcion invalida.");
            }
        } while (opcion != 4);
        scanner.close();
    }
}