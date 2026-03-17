package mini_retos_de_salida_por_consola;
public class presenta_datos_de_forma_profesional {
    public static void main(String[] args) {
        String producto = "laptop";
        int cantidad = 2;
        double precioUnitario = 1500.75;
        double total = cantidad * precioUnitario;
        System.out.println("=========== reporte de venta ===========");
        System.out.printf("%-20s %10s%n", "concepto", "valor");
        System.out.println("----------------------------------------");
        System.out.printf("%-20s %10s%n", "producto:", producto);
        System.out.printf("%-20s %10d%n", "cantidad:", cantidad);
        System.out.printf("%-20s %10.2f%n", "precio unitario:", precioUnitario);
        System.out.printf("%-20s %10.2f%n", "total:", total);
        System.out.println("----------------------------------------");
        System.out.printf("%-20s %10s%n", "estado:", "pagado");
        System.out.println("========================================");
    }
}