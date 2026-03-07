package casos_mas_reales;
import java.util.Scanner;
public class registro_de_inventario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombreProducto;
        String codigoProducto;
        int cantidad;
        double precio;
        String proveedor;
        System.out.println("registro de inventario");
        System.out.print("ingrese el nombre del producto: ");
        nombreProducto = entrada.nextLine();
        System.out.print("ingrese el codigo del producto: ");
        codigoProducto = entrada.nextLine();
        System.out.print("ingrese la cantidad disponible: ");
        cantidad = entrada.nextInt();
        System.out.print("ingrese el precio del producto: ");
        precio = entrada.nextDouble();
        entrada.nextLine(); 
        System.out.print("ingrese el nombre del proveedor: ");
        proveedor = entrada.nextLine();
        System.out.println("\n producto registrados ");
        System.out.println("producto: " + nombreProducto);
        System.out.println("codigo: " + codigoProducto);
        System.out.println("cantidad: " + cantidad);
        System.out.println("precio: $" + precio);
        System.out.println("proveedor: " + proveedor);
        entrada.close();
    }
}