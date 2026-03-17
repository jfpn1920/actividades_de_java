package combinando_print_println_y_printf;
public class mejora_la_salida_visual {
    public static void main(String[] args) {
        String producto = "zapatos";
        int cantidad = 3;
        double precio = 49.99;
        double total = cantidad * precio;
        System.out.println("resumen de la compra");
        System.out.println();
        System.out.printf("%-15s %-10s %-10s%n", "producto", "cantidad", "precio");
        System.out.println("---------------------------------------");
        System.out.printf("%-15s %-10d $%-9.2f%n", producto, cantidad, precio);
        System.out.println("---------------------------------------");
        System.out.printf("%-15s %-10s $%-9.2f%n", "total", "", total);
        System.out.println();
        System.out.println("=======================================");
    }
}