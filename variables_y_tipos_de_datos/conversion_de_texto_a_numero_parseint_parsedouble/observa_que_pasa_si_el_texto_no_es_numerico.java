package conversion_de_texto_a_numero_parseint_parsedouble;
public class observa_que_pasa_si_el_texto_no_es_numerico {
    public static void main(String[] args) {
        String texto = "hola"; 
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("numero convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("error: el texto ingresado no es un numero valido.");
        }
    }
}