package diferencia_entre_print_y_println;
public class observa_como_se_comporta_el_salto_de_linea {
    public static void main(String[] args) {
        System.out.print("linea 1 con print ");
        System.out.print("continua en la misma linea");
        System.out.println(); 
        System.out.println("linea 2 con println");
        System.out.println("linea 3 con println");
        System.out.print("linea 4 con print ");
        System.out.println("y termina con println");
    }
}