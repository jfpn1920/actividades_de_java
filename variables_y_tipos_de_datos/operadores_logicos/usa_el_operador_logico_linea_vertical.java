package operadores_logicos;
public class usa_el_operador_logico_linea_vertical {
    public static void main(String[] args) {
        int edad = 16;
        boolean tienePermisoEspecial = true;
        if (edad >= 18 || tienePermisoEspecial) {
            System.out.println("puede ingresar.");
        } else {
            System.out.println("no puede ingresar.");
        }
    }
}