package introduccion_a_excepciones;
public class provocar_nullpointerexception {
    public static void main(String[] args) {
        String texto = null;
        try {
            @SuppressWarnings("null")
            int longitud = texto.length();
            System.out.println("Longitud del texto: " + longitud);
        } catch (NullPointerException e) {
            System.out.println("Se produjo una NullPointerException.");
            System.out.println("No se puede usar un objeto que es null.");
        }
        System.out.println("El programa continúa ejecutándose.");
    }
}