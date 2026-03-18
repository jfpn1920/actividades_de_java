package constantes;
public class intenta_cambiar_el_valor_de_una_constante_y_observa_el_error {
    public static void main(String[] args) {
        int NUMERO = 10;
        NUMERO = 20; 
        System.out.println(NUMERO);
    }
}