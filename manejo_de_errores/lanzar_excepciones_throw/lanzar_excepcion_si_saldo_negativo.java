package lanzar_excepciones_throw;
import java.util.Scanner;
public class lanzar_excepcion_si_saldo_negativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese su saldo: ");
            double saldo = scanner.nextDouble();
            if (saldo < 0) {
                throw new IllegalArgumentException("error: el saldo no puede ser negativo.");
            }
            System.out.println("saldo ingresado correctamente: " + saldo);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}