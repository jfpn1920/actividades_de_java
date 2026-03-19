package uso_del_punto_y_coma;
public class identifica_errores_comunes_por_mal_uso_del_punto_y_coma {
    public static void main(String[] args) {
        int numero = 10; // ❌ Error: falta el ;
        System.out.println("Número: " + numero);; // ❌ Error: ; innecesario
        if (numero > 5); { // ❌ Error: ; innecesario en el if
            System.out.println("Es mayor que 5");
        }
        System.out.println("Fin del programa"); // ❌ Error: falta el ;
    }
}