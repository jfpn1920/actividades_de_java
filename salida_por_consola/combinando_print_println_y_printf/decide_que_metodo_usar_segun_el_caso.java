package combinando_print_println_y_printf;
public class decide_que_metodo_usar_segun_el_caso {
    public static void main(String[] args) {
        String nombre = "juan";
        int edad = 22;
        double nota = 4.7;
        System.out.println("informacion del estudiante");
        System.out.print("nombre: ");
        System.out.println(nombre);
        System.out.printf("edad: %d años%n", edad);
        System.out.printf("nota final: %.2f%n", nota);
        System.out.println("======================================");
    }
}