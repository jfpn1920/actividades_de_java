package introduccion_a_excepciones;
public class convertir_texto_invalido_a_numero {
    public static void main(String[] args) {
        String texto = "abc123"; 
        try {
            System.out.println("intentando convertir el texto a numero...");
            int numero = Integer.parseInt(texto); 
            System.out.println("numero convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("error: el texto ingresado no es un numero valido.");
        }
        System.out.println("el programa continua ejecutandose.");
    }
}