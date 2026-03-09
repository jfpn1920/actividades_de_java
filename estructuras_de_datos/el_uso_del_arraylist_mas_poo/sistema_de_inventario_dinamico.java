package el_uso_del_arraylist_mas_poo;
import java.util.ArrayList;
import java.util.Scanner;
public class sistema_de_inventario_dinamico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> inventario = new ArrayList<>();
        System.out.print("¿cuantos productos desea registrar?: ");
        int cantidad = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n producto " + (i + 1));
            System.out.print("nombre del producto: ");
            String nombre = sc.nextLine();
            System.out.print("precio: ");
            double precio = sc.nextDouble();
            System.out.print("cantidad: ");
            int cantidadProducto = sc.nextInt();
            sc.nextLine();
            inventario.add(new Producto(nombre, precio, cantidadProducto));
        }
        System.out.println("\n inventario de productos ");
        System.out.println("-----------------------");
        double totalInventario = 0;
        for (Producto p : inventario) {
            System.out.println(p);
            totalInventario += p.precio * p.cantidad;
        }
        System.out.println("\n valor total del inventario: " + totalInventario);
        sc.close();
    }
}
class Producto {
    String nombre;
    double precio;
    int cantidad;
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    @Override
    public String toString() {
        return "producto: " + nombre +
            " | precio: " + precio +
            " | cantidad: " + cantidad;
    }
}