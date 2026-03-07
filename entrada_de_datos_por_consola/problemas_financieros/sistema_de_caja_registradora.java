package problemas_financieros;
import java.util.Scanner;
public class sistema_de_caja_registradora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese la cantidad de productos: ");
        int cantidadProductos = entrada.nextInt();
        entrada.nextLine(); 
        double total = 0;
        String resumenProductos = ""; 
        for (int i = 1; i <= cantidadProductos; i++) {
            System.out.print("ingrese el nombre del producto " + i + ": ");
            String nombre = entrada.nextLine();
            System.out.print("ingrese el precio del producto " + i + ": ");
            double precio = entrada.nextDouble();
            entrada.nextLine(); 
            total += precio;
            resumenProductos += nombre + " - $" + precio + "\n";
        }
        System.out.println("\n resumen de la compra ");
        System.out.println(resumenProductos);
        System.out.println("cantidad de productos: " + cantidadProductos);
        System.out.println("total a pagar: $" + total);
        entrada.close();
    }
}