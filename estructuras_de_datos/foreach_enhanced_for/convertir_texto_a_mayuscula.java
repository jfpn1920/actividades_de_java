package foreach_enhanced_for;
public class convertir_texto_a_mayuscula {
    public static void main(String[] args) {
        String[] textos = {"java", "programacion", "computadora", "teclado", "pantalla"};
        for (String texto : textos) {
            System.out.println(texto.toUpperCase());
        }
    }
}