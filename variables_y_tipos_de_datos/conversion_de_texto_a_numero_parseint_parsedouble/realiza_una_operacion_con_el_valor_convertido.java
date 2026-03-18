package conversion_de_texto_a_numero_parseint_parsedouble;
public class realiza_una_operacion_con_el_valor_convertido {
    public static void main(String[] args) {
        String textoNumero = "20";
        int numero = Integer.parseInt(textoNumero);
        int resultado = numero * 2;
        System.out.println("numero original: " + numero);
        System.out.println("resultado de la operacion (numero * 2): " + resultado);
    }
}