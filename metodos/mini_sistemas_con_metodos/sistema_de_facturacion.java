package mini_sistemas_con_metodos;
import java.util.Scanner;
public class sistema_de_facturacion {
    public static double calcularTotal(double precio, int cantidad) {
        return precio * cantidad;
    }
    public static void mostrarFactura(String producto, double precio, int cantidad, double total) {
        System.out.println("\n facturaciones ");
        System.out.println("producto: " + producto);
        System.out.println("precio unitario: $" + precio);
        System.out.println("cantidad: " + cantidad);
        System.out.println("total a pagar: $" + total);
        System.out.println("-------------------");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese el nombre del producto: ");
        String producto = scanner.nextLine();
        System.out.print("ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("ingrese la cantidad: ");
        int cantidad = scanner.nextInt();
        double total = calcularTotal(precio, cantidad);
        mostrarFactura(producto, precio, cantidad, total);
        scanner.close();
    }
}