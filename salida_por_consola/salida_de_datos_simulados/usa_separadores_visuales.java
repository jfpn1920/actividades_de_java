package salida_de_datos_simulados;
public class usa_separadores_visuales {
    public static void main(String[] args) {
        String producto = "Laptop";
        int cantidad = 1;
        double precio = 2500.00;
        System.out.println("======================================");
        System.out.println("         detalle de compra            ");
        System.out.println("======================================");
        System.out.printf("producto: %s%n", producto);
        System.out.println("--------------------------------------");
        System.out.printf("cantidad: %d%n", cantidad);
        System.out.printf("precio: $%.2f%n", precio);
        System.out.println("--------------------------------------");
        System.out.println("gracias por su compra");
        System.out.println("======================================");
    }
}