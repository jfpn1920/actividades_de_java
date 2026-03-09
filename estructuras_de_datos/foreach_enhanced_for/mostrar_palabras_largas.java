package foreach_enhanced_for;
public class mostrar_palabras_largas {
    public static void main(String[] args) {
        String[] palabras = {"sol", "computadora", "java", "programacion", "luz", "teclado"};
        for (String palabra : palabras) {
            if (palabra.length() > 5) {
                System.out.println(palabra);
            }
        }
    }
}