package nivel_de_practica;
import java.util.Scanner;
public class sistema_de_facturacion_completo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cliente;
        String producto;
        int cantidad;
        double precio;
        double subtotal;
        double iva;
        double total;
        System.out.println("sistema de facturacion");
        System.out.print("ingrese el nombre del cliente: ");
        cliente = entrada.nextLine();
        System.out.print("ingrese el nombre del producto: ");
        producto = entrada.nextLine();
        System.out.print("ingrese la cantidad: ");
        cantidad = entrada.nextInt();
        System.out.print("ingrese el precio unitario: ");
        precio = entrada.nextDouble();
        subtotal = cantidad * precio;
        iva = subtotal * 0.19; 
        total = subtotal + iva;
        System.out.println("\nfactura");
        System.out.println("cliente: " + cliente);
        System.out.println("producto: " + producto);
        System.out.println("cantidad: " + cantidad);
        System.out.println("precio unitario: $" + precio);
        System.out.println("subtotal: $" + subtotal);
        System.out.println("iva 19%: $" + iva);
        System.out.println("total a pagar: $" + total);
        entrada.close();
    }
}