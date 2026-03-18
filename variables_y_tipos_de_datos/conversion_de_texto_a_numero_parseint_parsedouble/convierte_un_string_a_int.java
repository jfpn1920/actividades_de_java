package conversion_de_texto_a_numero_parseint_parsedouble;
public class convierte_un_string_a_int {
    public static void main(String[] args) {
        String textoNumero = "25";
        int numero = Integer.parseInt(textoNumero);
        System.out.println("texto original: " + textoNumero);
        System.out.println("numero convertido: " + numero);
    }
}