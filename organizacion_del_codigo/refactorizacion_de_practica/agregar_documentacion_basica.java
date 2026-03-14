package refactorizacion_de_practica;
/**
 * Clase que demuestra cómo agregar documentación básica en Java
 * utilizando comentarios JavaDoc. Este tipo de documentación
 * permite explicar el propósito de la clase y sus métodos.
 * 
 * @author Juan Felipe
 */
public class agregar_documentacion_basica {
    /**
     * Método principal del programa.
     * Sirve como punto de entrada de la aplicación.
     * 
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        int resultado = sumar(5, 3);
        System.out.println("El resultado de la suma es: " + resultado);
    }
    /**
     * Método que recibe dos números enteros y devuelve su suma.
     * 
     * @param a primer número entero
     * @param b segundo número entero
     * @return resultado de la suma de a y b
     */
    public static int sumar(int a, int b) {
        return a + b;
    }
}