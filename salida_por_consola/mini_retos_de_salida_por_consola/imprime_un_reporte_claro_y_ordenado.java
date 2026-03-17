package mini_retos_de_salida_por_consola;
public class imprime_un_reporte_claro_y_ordenado {
    public static void main(String[] args) {
        String nombre1 = "ana";
        int edad1 = 20;
        double nota1 = 4.5;
        String nombre2 = "luis";
        int edad2 = 22;
        double nota2 = 3.8;
        System.out.println("========= reporte de estudiantes =========");
        System.out.printf("%-10s %10s %10s%n", "nombre", "edad", "nota");
        System.out.println("------------------------------------------");
        System.out.printf("%-10s %10d %10.2f%n", nombre1, edad1, nota1);
        System.out.printf("%-10s %10d %10.2f%n", nombre2, edad2, nota2);
        System.out.println("------------------------------------------");
        
        double promedio = (nota1 + nota2) / 2;
        System.out.printf("%-10s %21.2f%n", "promedio:", promedio);
        System.out.println("==========================================");
    }
}