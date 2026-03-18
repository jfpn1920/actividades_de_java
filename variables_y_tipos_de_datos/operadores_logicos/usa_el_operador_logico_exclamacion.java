package operadores_logicos;
public class usa_el_operador_logico_exclamacion {
    public static void main(String[] args) {
        boolean tieneDeuda = false;
        if (!tieneDeuda) {
            System.out.println("puede realizar la compra.");
        } else {
            System.out.println("no puede realizar la compra.");
        }
    }
}