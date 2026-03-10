package lanzar_excepciones_throw;
import java.util.Scanner;
public class validar_rango_numerico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese un numero entre 1 y 100: ");
            int numero = scanner.nextInt();
            if (numero < 1 || numero > 100) {
                throw new IllegalArgumentException("error: el numero debe estar entre 1 y 100.");
            }
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