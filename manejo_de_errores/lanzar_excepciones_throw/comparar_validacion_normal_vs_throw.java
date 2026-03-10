package lanzar_excepciones_throw;
import java.util.Scanner;
public class comparar_validacion_normal_vs_throw {
    public static void validarConThrow(int numero) throws IllegalArgumentException {
        if (numero < 0) {
            throw new IllegalArgumentException("throw: el numero no puede ser negativo.");
        }
    }
    public static boolean validarNormal(int numero) {
        if (numero < 0) {
            System.out.println("validacion normal: el numero no puede ser negativo.");
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        int numero = scanner.nextInt();
        System.out.println("\n validacion normal ");
        if (validarNormal(numero)) {
            System.out.println("numero valido: " + numero);
        }
        System.out.println("\n validacion con throw ");
        try {
            validarConThrow(numero);
            System.out.println("numero valido: " + numero);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}