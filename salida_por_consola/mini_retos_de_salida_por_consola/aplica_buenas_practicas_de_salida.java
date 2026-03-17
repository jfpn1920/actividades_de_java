package mini_retos_de_salida_por_consola;
public class aplica_buenas_practicas_de_salida {
    public static void main(String[] args) {
        String nombre = "juan";
        int edad = 20;
        double promedio = 4.5;
        System.out.println("===== informacion del estudiante =====");
        System.out.println("nombre   : " + nombre);
        System.out.println("edad     : " + edad + " años");
        System.out.printf("promedio : %.2f%n", promedio);
        System.out.println("--------------------------------------");
        System.out.printf("resumen  : %s, %d años, promedio %.2f%n",
                nombre, edad, promedio);
        System.out.println("======================================");
    }
}