package nivel_de_practica;
import java.util.Scanner;
public class sistema_de_facturacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String producto;
        double precio;
        int cantidad;
        double subtotal;
        double total = 0;
        char continuar;
        System.out.println("sistema de facturacion");
        do {
            System.out.print("ingrese nombre del producto: ");
            producto = scanner.nextLine();
            System.out.print("ingrese precio del producto: ");
            precio = scanner.nextDouble();
            System.out.print("ingrese cantidad: ");
            cantidad = scanner.nextInt();
            subtotal = precio * cantidad;
            total += subtotal;
            System.out.println("subtotal de " + producto + ": $" + subtotal);
            scanner.nextLine(); 
            System.out.print("¿desea agregar otro producto? (s/n): ");
            continuar = scanner.nextLine().charAt(0);
        } while (continuar == 's' || continuar == 'S');
        System.out.println("\ntotal de la factura: $" + total);
        scanner.close();
    }
}