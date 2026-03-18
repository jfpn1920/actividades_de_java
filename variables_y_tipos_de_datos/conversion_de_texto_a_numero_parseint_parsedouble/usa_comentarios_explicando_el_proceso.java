package conversion_de_texto_a_numero_parseint_parsedouble;
public class usa_comentarios_explicando_el_proceso {
    public static void main(String[] args) {
        String textoNumero = "75";
        int numero = Integer.parseInt(textoNumero);
        int resultado = numero + 25;
        System.out.println("texto original: " + textoNumero);
        System.out.println("numero convertido: " + numero);
        System.out.println("resultado final (numero + 25): " + resultado);
    }
}