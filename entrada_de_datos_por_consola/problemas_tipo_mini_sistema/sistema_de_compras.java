package problemas_tipo_mini_sistema;
import java.util.Scanner;
public class sistema_de_compras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese el nombre del producto: ");
        String producto = entrada.nextLine();
        System.out.print("ingrese la cantidad a comprar: ");
        int cantidad = entrada.nextInt();
        System.out.print("ingrese el precio unitario: ");
        double precioUnitario = entrada.nextDouble();
        double total = cantidad * precioUnitario;
        double descuento = 0;
        if (total > 100) { 
            descuento = total * 0.10;
            total -= descuento;
        }
        System.out.println("\n sistema de compras ");
        System.out.println("producto: " + producto);
        System.out.println("cantidad: " + cantidad);
        System.out.println("precio unitario: " + precioUnitario);
        System.out.println("descuento aplicado: " + descuento);
        System.out.println("total a pagar: " + total);
        entrada.close();
    }
}