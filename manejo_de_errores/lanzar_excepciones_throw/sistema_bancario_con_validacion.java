package lanzar_excepciones_throw;
import java.util.Scanner;
public class sistema_bancario_con_validacion {
    public static void validarSaldo(double saldo) throws IllegalArgumentException {
        if (saldo < 0) {
            throw new IllegalArgumentException("error: el saldo inicial no puede ser negativo.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese su saldo inicial: ");
            double saldo = scanner.nextDouble();
            validarSaldo(saldo);
            System.out.println("saldo inicial registrado correctamente: " + saldo);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}