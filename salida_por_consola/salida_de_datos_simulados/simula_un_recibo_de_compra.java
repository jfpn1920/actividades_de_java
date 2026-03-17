package salida_de_datos_simulados;
public class simula_un_recibo_de_compra {
    public static void main(String[] args) {
        String producto = "camiseta";
        int cantidad = 2;
        double precio = 29.99;
        double total = cantidad * precio;
        System.out.println("recibo de compra");
        System.out.println();
        System.out.printf("%-15s %-10s %-10s%n", "Producto", "Cantidad", "Precio");
        System.out.println("------------------------------------");
        System.out.printf("%-15s %-10d $%-9.2f%n", producto, cantidad, precio);
        System.out.println("------------------------------------");
        System.out.printf("%-15s %-10s $%-9.2f%n", "total", "", total);
        System.out.println();
        System.out.println("====================================");
    }
}