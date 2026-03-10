package lanzar_excepciones_throw;
import java.util.Scanner;
public class capturar_excepcion_lanzada {
    public static void validarNumero(int numero) throws IllegalArgumentException {
        if (numero > 100) {
            throw new IllegalArgumentException("error: el numero no puede ser mayor a 100.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese un numero maximo 100: ");
            int numero = scanner.nextInt();
            validarNumero(numero);
            System.out.println("numero ingresado correctamente: " + numero);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}