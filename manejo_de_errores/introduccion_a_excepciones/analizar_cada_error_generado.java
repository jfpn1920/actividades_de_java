package introduccion_a_excepciones;
public class analizar_cada_error_generado {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int resultado = a / b;
        } catch (ArithmeticException e) {
            System.out.println("error detectado: arithmeticexception division por cero");
        }
        try {
            String texto = null;
            @SuppressWarnings("null")
            int longitud = texto.length();
        } catch (NullPointerException e) {
            System.out.println("error detectado: nullpointerexception Objeto null");
        }
        try {
            int[] numeros = {1, 2, 3};
            int valor = numeros[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error detectado: arrayindexoutofboundsexception indice invalido");
        }
        try {
            String palabra = "abc";
            int numero = Integer.parseInt(palabra);
        } catch (NumberFormatException e) {
            System.out.println("error detectado: numberformatexception texto no convertible a numero");
        }
        System.out.println("analisis de errores finalizado.");
    }
}