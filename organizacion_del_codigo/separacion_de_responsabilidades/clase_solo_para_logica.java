package separacion_de_responsabilidades;
public class clase_solo_para_logica {
    public static int sumar(int numeroUno, int numeroDos) {
        return numeroUno + numeroDos;
    }
    public static int restar(int numeroUno, int numeroDos) {
        return numeroUno - numeroDos;
    }
    public static void mostrarResultado(int resultado) {
        System.out.println("el resultado es: " + resultado);
    }
}