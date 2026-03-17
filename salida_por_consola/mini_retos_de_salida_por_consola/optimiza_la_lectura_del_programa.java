package mini_retos_de_salida_por_consola;
public class optimiza_la_lectura_del_programa {
    public static void main(String[] args) {
        String nombreEstudiante = "juan";
        int edadEstudiante = 20;
        double promedioEstudiante = 4.5;
        System.out.println("===== reporte del estudiante =====");
        System.out.println("nombre   : " + nombreEstudiante);
        System.out.println("edad     : " + edadEstudiante + " años");
        System.out.printf("promedio : %.2f%n", promedioEstudiante);
        System.out.println("----------------------------------");
        System.out.printf("resumen  : %s, %d años, promedio %.2f%n",
                nombreEstudiante, edadEstudiante, promedioEstudiante);
        System.out.println("==================================");
    }
}