package separacion_de_responsabilidades;
public class refactorizar_sistema_antiguo {
    public static void main(String[] args) {
        int numeroUno = obtenerPrimerNumero();
        int numeroDos = obtenerSegundoNumero();
        int resultado = calcularSuma(numeroUno, numeroDos);
        mostrarResultado(resultado);
    }
    public static int obtenerPrimerNumero() {
        return 5;
    }
    public static int obtenerSegundoNumero() {
        return 3;
    }
    public static int calcularSuma(int a, int b) {
        return a + b;
    }
    public static void mostrarResultado(int resultado) {
        System.out.println("resultado de la suma: " + resultado);
    }
}