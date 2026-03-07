package el_uso_del_break;
import java.util.Scanner;
public class simulacion_de_control_de_stock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stock = 10; 
        int venta;
        System.out.println("control de stock");
        System.out.println("stock inicial: " + stock);
        while (true) {
            System.out.print("ingrese cantidad vendida: ");
            venta = scanner.nextInt();
            stock -= venta;
            if (stock <= 0) {
                System.out.println("stock agotado.");
                break; 
            }
            System.out.println("stock restante: " + stock);
        }
        System.out.println("sistema detenido por falta de stock.");
        scanner.close();
    }
}