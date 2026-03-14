package nivel_de_practica;
import java.util.ArrayList;
import java.util.Scanner;
public class sistema_inventario {
    static ArrayList<String> productos = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        mostrarMenu();
    }
    public static void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n sistema de inventario ");
            System.out.println("1. agregar producto");
            System.out.println("2. mostrar inventario");
            System.out.println("3. eliminar producto");
            System.out.println("4. salir");
            System.out.print("seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    mostrarInventario();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    System.out.println("saliendo del sistema...");
                    break;
                default:
                    System.out.println("opcion invalida.");
            }
        } while (opcion != 4);
    }
    public static void agregarProducto() {
        System.out.print("ingrese el nombre del producto: ");
        String producto = scanner.nextLine();
        productos.add(producto);
        System.out.println("producto agregado correctamente.");
    }
    public static void mostrarInventario() {
        if (productos.isEmpty()) {
            System.out.println("el inventario esta vacio.");
            return;
        }
        System.out.println("\n inventario de productos:");
        for (int i = 0; i < productos.size(); i++) {
            System.out.println((i + 1) + ". " + productos.get(i));
        }
    }
    public static void eliminarProducto() {
        if (productos.isEmpty()) {
            System.out.println("no hay productos para eliminar.");
            return;
        }
        mostrarInventario();
        System.out.print("ingrese el numero del producto a eliminar: ");
        int indice = scanner.nextInt();
        if (indice > 0 && indice <= productos.size()) {
            productos.remove(indice - 1);
            System.out.println("producto eliminado correctamente.");
        } else {
            System.out.println("numero invalido.");
        }
    }
}