package salida_de_datos_simulados;
public class muestra_informacion_tipo_reporte {
    public static void main(String[] args) {
        String empresa = "tech solutions";
        int empleados = 25;
        double ingresos = 15000.75;
        double gastos = 8000.50;
        double ganancia = ingresos - gastos;
        System.out.println("reporte empresarial");
        System.out.println();
        System.out.printf("%-15s: %s%n", "empresa", empresa);
        System.out.printf("%-15s: %d%n", "empleados", empleados);
        System.out.printf("%-15s: $%.2f%n", "ingresos", ingresos);
        System.out.printf("%-15s: $%.2f%n", "gastos", gastos);
        System.out.println("---------------------------------------");
        System.out.printf("%-15s : $%.2f%n", "ganancia", ganancia);
        System.out.println();
        System.out.println("=======================================");
    }
}