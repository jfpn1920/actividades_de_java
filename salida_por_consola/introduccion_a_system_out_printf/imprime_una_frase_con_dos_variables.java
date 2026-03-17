package introduccion_a_system_out_printf;
public class imprime_una_frase_con_dos_variables {
    public static void main(String[] args) {
        String nombre = "juan";
        String ciudad = "medellin";
        System.out.printf("hola, mi nombre es %s y vivo en %s.%n", nombre, ciudad);
    }
}