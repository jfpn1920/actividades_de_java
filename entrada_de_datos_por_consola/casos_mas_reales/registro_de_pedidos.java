package casos_mas_reales;
import java.util.Scanner;
public class registro_de_pedidos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese la cantidad de pedidos a registrar: ");
        int cantidadPedidos = entrada.nextInt();
        entrada.nextLine(); 
        String resumenPedidos = "";
        int totalProductos = 0;
        for (int i = 1; i <= cantidadPedidos; i++) {
            System.out.println("\n pedido " + i + " ");
            System.out.print("ingrese el nombre del producto: ");
            String producto = entrada.nextLine();
            System.out.print("ingrese la cantidad del producto: ");
            int cantidad = entrada.nextInt();
            entrada.nextLine(); 
            totalProductos += cantidad;
            resumenPedidos += "producto: " + producto + ", cantidad: " + cantidad + "\n";
        }
        System.out.println("\n resumen de pedidos ");
        System.out.println(resumenPedidos);
        System.out.println("total de productos pedidos: " + totalProductos);
        entrada.close();
    }
}