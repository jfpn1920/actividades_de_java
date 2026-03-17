package combinando_print_println_y_printf;
public class usa_los_tres_metodos_en_un_mismo_programa {
    public static void main(String[] args) {
        System.out.print("hola, ");
        System.out.print("bienvenido ");
        System.out.println("al programa.");
        String nombre = "juan";
        int edad = 22;
        System.out.printf("nombre: %s | edad: %d%n", nombre, edad);
    }
}