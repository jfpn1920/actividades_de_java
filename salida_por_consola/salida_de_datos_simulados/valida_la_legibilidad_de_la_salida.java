package salida_de_datos_simulados;
public class valida_la_legibilidad_de_la_salida {
    public static void main(String[] args) {
        String nombre = "Juan";
        int edad = 22;
        double saldo = 350.75;
        System.out.println("informacion");
        System.out.println();
        System.out.printf("%-12s: %s%n", "nombre", nombre);
        System.out.printf("%-12s: %d años%n", "edad", edad);
        System.out.printf("%-12s: $%.2f%n", "saldo", saldo);
        System.out.println();
        System.out.println("================================");
    }
}