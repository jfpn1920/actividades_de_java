package conversion_de_texto_a_numero_parseint_parsedouble;
public class convierte_un_string_a_double {
    public static void main(String[] args) {
        String textoNumero = "45.67";
        double numero = Double.parseDouble(textoNumero);
        System.out.println("texto original: " + textoNumero);
        System.out.println("numero convertido: " + numero);
    }
}