package uso_combinado_de_int_double_y_string;
import java.util.Scanner;
public class simular_factura_simple {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese el nombre del producto: ");
        String producto = entrada.nextLine();
        System.out.print("ingrese la cantidad: ");
        int cantidad = entrada.nextInt();
        System.out.print("ingrese el precio por unidad: ");
        double precio = entrada.nextDouble();
        double total = cantidad * precio;
        System.out.println("\nfacturacion");
        System.out.println("producto: " + producto);
        System.out.println("cantidad: " + cantidad);
        System.out.println("precio unitario: " + precio);
        System.out.println("total a pagar: " + total);
        entrada.close();
    }
}