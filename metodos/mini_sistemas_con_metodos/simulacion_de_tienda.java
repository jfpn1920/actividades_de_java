package mini_sistemas_con_metodos;
import java.util.Scanner;
public class simulacion_de_tienda {
    public static void mostrarProductos() {
        System.out.println("\n menu de tienda ");
        System.out.println("1. camisa - $50");
        System.out.println("2. pantalón - $80");
        System.out.println("3. zapatos - $120");
        System.out.println("4. salir");
        System.out.print("seleccione un producto: ");
    }
    public static double obtenerPrecio(int opcion) {
        switch (opcion) {
            case 1:
                return 50;
            case 2:
                return 80;
            case 3:
                return 120;
            default:
                return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        int opcion;
        do {
            mostrarProductos();
            opcion = scanner.nextInt();
            if (opcion >= 1 && opcion <= 3) {
                double precio = obtenerPrecio(opcion);
                System.out.print("ingrese la cantidad: ");
                int cantidad = scanner.nextInt();
                total += precio * cantidad;
                System.out.println("producto agregado al carrito.");
                System.out.println("total actual: $" + total);
            }
        } while (opcion != 4);
        System.out.println("\n compra finalizada.");
        System.out.println("total a pagar: $" + total);
        scanner.close();
    }
}