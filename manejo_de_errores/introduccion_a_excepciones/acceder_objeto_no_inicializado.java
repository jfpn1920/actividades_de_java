package introduccion_a_excepciones;
public class acceder_objeto_no_inicializado {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        String mensaje = null; 
        try {
            System.out.println("intentando acceder al objeto...");
            int longitud = mensaje.length(); 
            System.out.println("longitud del mensaje: " + longitud);
        } catch (NullPointerException e) {
            System.out.println("error: se intento usar un objeto que no ha sido inicializado.");
        }
        System.out.println("el programa continua ejecutandose.");
    }
}