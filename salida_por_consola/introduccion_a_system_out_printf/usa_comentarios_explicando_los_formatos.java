package introduccion_a_system_out_printf;
public class usa_comentarios_explicando_los_formatos {
    public static void main(String[] args) {
        String nombre = "juan";
        int edad = 22;
        double altura = 1.75;
        System.out.printf("nombre: %s%n", nombre);     
        System.out.printf("edad: %d%n", edad);        
        System.out.printf("altura: %f%n", altura);     
    }
}