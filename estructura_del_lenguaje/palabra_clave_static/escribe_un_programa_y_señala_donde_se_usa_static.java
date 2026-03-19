package palabra_clave_static;
public class escribe_un_programa_y_señala_donde_se_usa_static {
    static int numero = 10;
    public static void mostrarNumero() {
        System.out.println("numero: " + numero);
    }
    public static void main(String[] args) {
        mostrarNumero();
    }
}