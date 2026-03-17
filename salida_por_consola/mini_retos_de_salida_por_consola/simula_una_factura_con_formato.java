package mini_retos_de_salida_por_consola;
public class simula_una_factura_con_formato {
    public static void main(String[] args) {
        String producto1 = "camiseta";
        int cantidad1 = 2;
        double precio1 = 25.50;
        String producto2 = "pantalon";
        int cantidad2 = 1;
        double precio2 = 60.00;
        double total1 = cantidad1 * precio1;
        double total2 = cantidad2 * precio2;
        double totalGeneral = total1 + total2;
        System.out.println("========= factura =========");
        System.out.printf("%-15s %10s %10s %10s%n", "producto", "cant", "precio", "total");
        System.out.println("-----------------------------------------------");
        System.out.printf("%-15s %10d %10.2f %10.2f%n", producto1, cantidad1, precio1, total1);
        System.out.printf("%-15s %10d %10.2f %10.2f%n", producto2, cantidad2, precio2, total2);
        System.out.println("-----------------------------------------------");
        System.out.printf("%-15s %30.2f%n", "total:", totalGeneral);
        System.out.println("===============================================");
    }
}