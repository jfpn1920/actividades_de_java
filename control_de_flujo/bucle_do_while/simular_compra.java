package bucle_do_while;
import java.util.Scanner;
public class simular_compra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String producto;
        double precio;
        double total = 0.0;
        String continuar;
        System.out.println("simulacion de compra");
        do {
            System.out.print("ingrese el nombre del producto: ");
            producto = scanner.nextLine();
            System.out.print("ingrese el precio del producto: ");
            precio = scanner.nextDouble();
            scanner.nextLine();
            total += precio;
            System.out.println("producto agregado: " + producto + " - $" + precio);
            System.out.println("total acumulado: $" + total);
            System.out.print("¿desea agregar otro producto? (s/n): ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("s"));
        System.out.println("compra finalizada, total a pagar: $" + total);
        System.out.println("¡gracias por su compra!");
        scanner.close();
    }
}