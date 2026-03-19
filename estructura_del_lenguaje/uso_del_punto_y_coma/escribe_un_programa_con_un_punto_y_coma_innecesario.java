package uso_del_punto_y_coma;
public class escribe_un_programa_con_un_punto_y_coma_innecesario {
    public static void main(String[] args) {
        int numero = 10;; // ❌ ; innecesario
        System.out.println("numero: " + numero);
        if (numero > 5); { // ❌ ; innecesario (más peligroso)
            System.out.println("el numero es mayor que 5");
        }
    }
}