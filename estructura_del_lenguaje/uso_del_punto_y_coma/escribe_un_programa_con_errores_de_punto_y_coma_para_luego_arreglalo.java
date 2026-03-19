package uso_del_punto_y_coma;
public class escribe_un_programa_con_errores_de_punto_y_coma_para_luego_arreglalo {
    public static void main(String[] args) {
        int numero = 5; // ❌ falta ;
        System.out.println("numero: " + numero); // ❌ falta ;
        if (numero > 3); { // ❌ ; innecesario
            System.out.println("es mayor que 3");
        }
    }
}