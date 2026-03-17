package combinando_print_println_y_printf;
public class corrige_un_programa_desordenado {
    public static void main(String[] args) {
        String producto = "camisa";
        int cantidad = 2;
        double precio = 25.5;
        System.out.println("detalle de compra");
        System.out.println();
        System.out.printf("producto: %s%n", producto);
        System.out.printf("cantidad: %d%n", cantidad);
        System.out.printf("precio: $%.2f%n", precio);
        System.out.println("=============================");
    }
}