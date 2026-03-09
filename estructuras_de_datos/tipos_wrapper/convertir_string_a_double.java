package tipos_wrapper;
public class convertir_string_a_double {
    public static void main(String[] args) {
        String textoNumero = "25.75";
        Double numero = Double.valueOf(textoNumero);
        System.out.println("el numero convertido es: " + numero);
    }
}