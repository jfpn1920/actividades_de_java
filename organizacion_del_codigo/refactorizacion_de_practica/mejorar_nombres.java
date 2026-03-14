package refactorizacion_de_practica;
public class mejorar_nombres {
    public static void main(String[] args) {
        mostrarMensajeBienvenida();
        int resultadoSuma = calcularSuma(5, 10);
        mostrarResultado(resultadoSuma);
    }
    public static void mostrarMensajeBienvenida() {
        System.out.println("refactorizacion: mejora de nombres en el codigo.");
    }
    public static int calcularSuma(int numeroUno, int numeroDos) {
        return numeroUno + numeroDos;
    }
    public static void mostrarResultado(int resultado) {
        System.out.println("el resultado de la suma es: " + resultado);
    }
}