package lanzar_excepciones_throw;
import java.util.Scanner;
public class metodo_que_lanza_excepcion {
    public static void validarNumero(int numero) throws IllegalArgumentException {
        if (numero < 0) {
            throw new IllegalArgumentException("error: el numero no puede ser negativo.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese un numero: ");
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