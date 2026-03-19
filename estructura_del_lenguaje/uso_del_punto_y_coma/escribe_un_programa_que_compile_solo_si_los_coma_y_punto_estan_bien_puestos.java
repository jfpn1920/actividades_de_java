package uso_del_punto_y_coma;
public class escribe_un_programa_que_compile_solo_si_los_coma_y_punto_estan_bien_puestos {
    public static void main(String[] args) {
        int numero = 10; // ❌ falta ;
        System.out.println("Número: " + numero); // ❌ falta ;
    }
}