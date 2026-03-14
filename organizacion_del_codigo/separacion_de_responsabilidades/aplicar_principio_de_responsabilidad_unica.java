package separacion_de_responsabilidades;
public class aplicar_principio_de_responsabilidad_unica {
    public static void main(String[] args) {
        int numeroUno = obtenerNumeroUno();
        int numeroDos = obtenerNumeroDos();
        int resultadoSuma = calcularSuma(numeroUno, numeroDos);
        mostrarResultado(resultadoSuma);
    }
    public static int obtenerNumeroUno() {
        return 10;
    }
    public static int obtenerNumeroDos() {
        return 5;
    }
    public static int calcularSuma(int a, int b) {
        return a + b;
    }
    public static void mostrarResultado(int resultado) {
        System.out.println("el resultado de la suma es: " + resultado);
    }
}