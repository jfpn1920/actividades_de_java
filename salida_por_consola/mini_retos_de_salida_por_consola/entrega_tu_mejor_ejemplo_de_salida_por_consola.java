package mini_retos_de_salida_por_consola;
public class entrega_tu_mejor_ejemplo_de_salida_por_consola {
    public static void main(String[] args) {
        String cliente = "genis nieto";
        String ciudad = "medellin";
        String producto1 = "Laptop";
        int cantidad1 = 1;
        double precio1 = 2500.00;
        String producto2 = "mouse";
        int cantidad2 = 2;
        double precio2 = 50.75;
        double total1 = cantidad1 * precio1;
        double total2 = cantidad2 * precio2;
        double totalGeneral = total1 + total2;
        System.out.println("=========== sistema de ventas ===========");
        System.out.printf("cliente: %s | ciudad: %s%n", cliente, ciudad);
        System.out.println("-----------------------------------------");
        System.out.printf("%-15s %10s %10s %10s%n", "producto", "cant", "precio", "total");
        System.out.println("-----------------------------------------");
        System.out.printf("%-15s %10d %10.2f %10.2f%n", producto1, cantidad1, precio1, total1);
        System.out.printf("%-15s %10d %10.2f %10.2f%n", producto2, cantidad2, precio2, total2);
        System.out.println("-----------------------------------------");
        System.out.printf("%-15s %30.2f%n", "total:", totalGeneral);
        System.out.println("=========================================");
        System.out.println("gracias por su compra 🙌");
    }
}