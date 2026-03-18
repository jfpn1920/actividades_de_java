package operadores_logicos;
public class usa_el_operador_logico_ampersand {
    public static void main(String[] args) {
        int edad = 20;
        boolean tieneLicencia = true;
        if (edad >= 18 && tieneLicencia) {
            System.out.println("puede conducir.");
        } else {
            System.out.println("no puede conducir.");
        }
    }
}