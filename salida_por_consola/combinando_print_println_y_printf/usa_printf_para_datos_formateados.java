package combinando_print_println_y_printf;
public class usa_printf_para_datos_formateados {
    public static void main(String[] args) {
        String nombre = "juan";
        int edad = 22;
        double promedio = 4.56;
        System.out.printf("nombre: %s%n", nombre);
        System.out.printf("edad: %d años%n", edad);
        System.out.printf("promedio: %.2f%n", promedio);
    }
}