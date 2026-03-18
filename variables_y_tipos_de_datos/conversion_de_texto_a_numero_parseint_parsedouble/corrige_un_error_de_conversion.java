package conversion_de_texto_a_numero_parseint_parsedouble;
public class corrige_un_error_de_conversion {
    public static void main(String[] args) {
        String texto = "50";
        int numero = Integer.parseInt(texto);
        System.out.println("numero convertido: " + numero);
    }
}