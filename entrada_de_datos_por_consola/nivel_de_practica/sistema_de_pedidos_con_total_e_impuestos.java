package nivel_de_practica;
import java.util.Scanner;
public class sistema_de_pedidos_con_total_e_impuestos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cliente;
        String producto;
        int cantidad;
        double precioUnitario;
        double subtotal;
        double impuesto;
        double total;
        System.out.println("sistema de pedidos");
        System.out.print("ingrese el nombre del cliente: ");
        cliente = entrada.nextLine();
        System.out.print("ingrese el nombre del producto: ");
        producto = entrada.nextLine();
        System.out.print("ingrese la cantidad del producto: ");
        cantidad = entrada.nextInt();
        System.out.print("ingrese el precio unitario: ");
        precioUnitario = entrada.nextDouble();
        subtotal = cantidad * precioUnitario;
        impuesto = subtotal * 0.19; 
        total = subtotal + impuesto;
        System.out.println("\nresumen del pedido");
        System.out.println("cliente: " + cliente);
        System.out.println("producto: " + producto);
        System.out.println("cantidad: " + cantidad);
        System.out.println("precio unitario: $" + precioUnitario);
        System.out.println("subtotal: $" + subtotal);
        System.out.println("impuesto 19%: $" + impuesto);
        System.out.println("total a pagar: $" + total);
        entrada.close();
    }
}