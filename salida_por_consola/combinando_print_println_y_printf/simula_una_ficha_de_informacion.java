package combinando_print_println_y_printf;
public class simula_una_ficha_de_informacion {
    public static void main(String[] args) {
        String nombre = "juan";
        int edad = 22;
        String ciudad = "medellin";
        double promedio = 4.5;
        System.out.println(" ficha de informacion");
        System.out.println();
        System.out.printf("nombre  : %s%n", nombre);
        System.out.printf("edad    : %d años%n", edad);
        System.out.printf("ciudad  : %s%n", ciudad);
        System.out.printf("promedio: %.2f%n", promedio);
        System.out.println("===============================");
    }
}