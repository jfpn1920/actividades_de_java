package mini_retos_de_variables_y_datos;
public class evalua_condiciones_con_operadores_logicos {
    public static void main(String[] args) {
        int edad = 20;
        boolean tieneLicencia = true;
        if (edad >= 18 && tieneLicencia) {
            System.out.println("puede conducir.");
        } else {
            System.out.println("no puede conducir.");
        }
        if (edad < 18 || !tieneLicencia) {
            System.out.println("no cumple todos los requisitos.");
        }
    }
}