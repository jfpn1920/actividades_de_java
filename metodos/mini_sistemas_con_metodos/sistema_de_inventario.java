package mini_sistemas_con_metodos;
import java.util.Scanner;
public class sistema_de_inventario {
    public static void registrarProductos(String[] productos, Scanner scanner) {
        for (int i = 0; i < productos.length; i++) {
            System.out.print("ingrese el nombre del producto " + (i + 1) + ": ");
            productos[i] = scanner.nextLine();
        }
    }
    public static void mostrarInventario(String[] productos) {
        System.out.println("\n sistema de inentario ");
        for (int i = 0; i < productos.length; i++) {
            System.out.println((i + 1) + ". " + productos[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] productos = new String[5];
        registrarProductos(productos, scanner);
        mostrarInventario(productos);
        scanner.close();
    }
}