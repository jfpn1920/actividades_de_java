package problemas_tipo_mini_sistema;
import java.util.Scanner;
public class registro_de_ventas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese el nombre del producto: ");
        String producto = entrada.nextLine();
        System.out.print("ingrese la cantidad vendida: ");
        int cantidad = entrada.nextInt();
        System.out.print("ingrese el precio unitario: ");
        double precioUnitario = entrada.nextDouble();
        double total = cantidad * precioUnitario;
        System.out.println("\n registro de venta ");
        System.out.println("producto: " + producto);
        System.out.println("cantidad: " + cantidad);
        System.out.println("precio unitario: " + precioUnitario);
        System.out.println("total de la venta: " + total);
        entrada.close();
    }
}