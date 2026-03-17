package salida_de_datos_simulados;
public class mejora_el_diseño_del_reporte {
    public static void main(String[] args) {
        String empresa = "tech solutions";
        int empleados = 25;
        double ingresos = 20000.00;
        double gastos = 12000.50;
        double ganancia = ingresos - gastos;
        System.out.println("========================================");
        System.out.println("         reporte empresarial            ");
        System.out.println("========================================");
        System.out.println();
        System.out.printf("%-20s : %s%n", "empresa", empresa);
        System.out.printf("%-20s : %d%n", "empleados", empleados);
        System.out.println("----------------------------------------");
        System.out.printf("%-20s : $%10.2f%n", "ingresos", ingresos);
        System.out.printf("%-20s : $%10.2f%n", "gastos", gastos);
        System.out.println("----------------------------------------");
        System.out.printf("%-20s : $%10.2f%n", "ganancia", ganancia);
        System.out.println();
        System.out.println("========================================");
    }
}