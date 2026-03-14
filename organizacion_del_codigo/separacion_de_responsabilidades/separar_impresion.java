package separacion_de_responsabilidades;
public class separar_impresion {
    public static void main(String[] args) {
        int numeroUno = 6;
        int numeroDos = 4;
        int resultado = sumarNumeros(numeroUno, numeroDos);
        mostrarResultado(resultado);
    }
    public static int sumarNumeros(int a, int b) {
        return a + b;
    }
    public static void mostrarResultado(int resultado) {
        System.out.println("el resultado de la suma es: " + resultado);
    }
}