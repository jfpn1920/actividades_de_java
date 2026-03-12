package scope_alcance_de_variables;
public class intentar_usar_variable_fuera_de_su_scope {
    public static void main(String[] args) {
        if (true) {
            int numero = 10;
            System.out.println("numero dentro del if: " + numero);
        }
    }
}