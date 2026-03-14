package refactorizacion_de_practica;
public class eliminar_duplicacion {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 5;
        int suma = sumar(numero1, numero2);
        int resta = restar(numero1, numero2);
        mostrarResultado("suma", suma);
        mostrarResultado("resta", resta);
    }
    public static int sumar(int a, int b) {
        return a + b;
    }
    public static int restar(int a, int b) {
        return a - b;
    }
    public static void mostrarResultado(String operacion, int resultado) {
        System.out.println("el resultado de la " + operacion + " es: " + resultado);
    }
}