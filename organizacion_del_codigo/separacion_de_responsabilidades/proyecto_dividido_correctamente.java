package separacion_de_responsabilidades;
public class proyecto_dividido_correctamente {
    public static void main(String[] args) {
        int numeroUno = obtenerNumeroUno();
        int numeroDos = obtenerNumeroDos();
        int resultado = calcularSuma(numeroUno, numeroDos);
        mostrarResultado(resultado);
    }
    public static int obtenerNumeroUno() {
        return 5;
    }
    public static int obtenerNumeroDos() {
        return 7;
    }
    public static int calcularSuma(int a, int b) {
        return a + b;
    }
    public static void mostrarResultado(int resultado) {
        System.out.println("el resultado de la suma es: " + resultado);
    }
}