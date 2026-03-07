package nivel_de_practica;
import java.util.Scanner;
public class mini_erp_basico_por_consola {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String empresa;
        String cliente;
        String producto;
        int cantidad;
        double precioUnitario;
        double subtotal;
        double impuesto;
        double total;
        System.out.println("mini erp basico");
        System.out.print("ingrese el nombre de la empresa: ");
        empresa = entrada.nextLine();
        System.out.print("ingrese el nombre del cliente: ");
        cliente = entrada.nextLine();
        System.out.print("ingrese el producto vendido: ");
        producto = entrada.nextLine();
        System.out.print("ingrese la cantidad: ");
        cantidad = entrada.nextInt();
        System.out.print("ingrese el precio unitario: ");
        precioUnitario = entrada.nextDouble();
        subtotal = cantidad * precioUnitario;
        impuesto = subtotal * 0.19;
        total = subtotal + impuesto;
        System.out.println("\n reporte del erp ");
        System.out.println("empresa: " + empresa);
        System.out.println("cliente: " + cliente);
        System.out.println("producto: " + producto);
        System.out.println("cantidad: " + cantidad);
        System.out.println("precio unitario: $" + precioUnitario);
        System.out.println("subtotal: $" + subtotal);
        System.out.println("impuesto 19%: $" + impuesto);
        System.out.println("total de la venta: $" + total);
        entrada.close();
    }
}