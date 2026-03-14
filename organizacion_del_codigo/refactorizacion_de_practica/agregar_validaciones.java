package refactorizacion_de_practica;
public class agregar_validaciones {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 0;
        if (validarNumero(numero1) && validarNumero(numero2)) {
            dividirNumeros(numero1, numero2);
        }
    }
    public static boolean validarNumero(int numero) {
        if (numero < 0) {
            System.out.println("error: el numero no puede ser negativo.");
            return false;
        }
        return true;
    }
    public static void dividirNumeros(int numero1, int numero2) {
        if (numero2 == 0) {
            System.out.println("error: no se puede dividir entre cero.");
            return;
        }
        int resultado = numero1 / numero2;
        mostrarResultado(resultado);
    }
    public static void mostrarResultado(int resultado) {
        System.out.println("el resultado de la division es: " + resultado);
    }
}