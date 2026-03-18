package operadores_logicos;
public class guarda_el_resultado_en_una_variable_boolean {
    public static void main(String[] args) {
        int edad = 19;
        boolean tieneEntrada = true;
        boolean puedeEntrar = (edad >= 18 && tieneEntrada);
        if (puedeEntrar) {
            System.out.println("puede entrar al evento.");
        } else {
            System.out.println("no puede entrar al evento.");
        }
    }
}