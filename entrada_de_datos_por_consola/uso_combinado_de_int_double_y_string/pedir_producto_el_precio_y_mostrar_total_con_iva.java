package uso_combinado_de_int_double_y_string;
import java.util.Scanner;
public class pedir_producto_el_precio_y_mostrar_total_con_iva {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese el nombre del producto: ");
        String producto = entrada.nextLine();
        System.out.print("ingrese el precio del producto: ");
        double precio = entrada.nextDouble();
        double iva = precio * 0.19;
        double total = precio + iva;
        System.out.println("producto: " + producto);
        System.out.println("precio sin iva: " + precio);
        System.out.println("iva (19%): " + iva);
        System.out.println("total a pagar: " + total);
        entrada.close();
    }
}