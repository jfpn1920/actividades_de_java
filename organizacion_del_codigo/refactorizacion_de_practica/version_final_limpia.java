package refactorizacion_de_practica;
public class version_final_limpia {
    public static void main(String[] args) {
        ejecutarPrograma();
    }
    public static void ejecutarPrograma() {
        int numero1 = 10;
        int numero2 = 5;
        int resultado = sumar(numero1, numero2);
        mostrarResultado(resultado);
    }
    /**
     * Realiza la suma de dos números
     * @param a primer número
     * @param b segundo número
     * @return resultado de la suma
     */
    public static int sumar(int a, int b) {
        return a + b;
    }
    /**
     * Muestra el resultado en consola
     * @param resultado valor a mostrar
     */
    public static void mostrarResultado(int resultado) {
        System.out.println("El resultado es: " + resultado);
    }
}