package refactorizacion_de_practica;
public class agregar_metodos_faltantes {
    public static void main(String[] args) {
        iniciarPrograma();
        int resultado = sumarNumeros(8, 12);
        mostrarResultado(resultado);
        finalizarPrograma();
    }
    public static void iniciarPrograma() {
        System.out.println("inicio del programa");
    }
    public static int sumarNumeros(int numero1, int numero2) {
        return numero1 + numero2;
    }
    public static void mostrarResultado(int resultado) {
        System.out.println("el resultado de la suma es: " + resultado);
    }
    public static void finalizarPrograma() {
        System.out.println("fin del programa");
    }
}