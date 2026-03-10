package introduccion_a_excepciones;
public class provocar_numberformatexception {
    public static void main(String[] args) {
        String texto = "hola"; 
        try {
            int numero = Integer.parseInt(texto); 
            System.out.println("numero convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("error: el texto no se puede convertir a numero.");
        }
        System.out.println("el programa continua ejecutandose.");
    }
}