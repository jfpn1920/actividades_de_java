package uso_del_finally;
import java.util.Scanner;
import java.util.InputMismatchException;
public class finally_en_sistema_bancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.0;
        try {
            System.out.println("sistema bancario");
            System.out.println("saldo actual: $" + saldo);
            System.out.print("ingrese la cantidad a retirar: ");
            double retiro = scanner.nextDouble();
            if (retiro > saldo) {
                throw new ArithmeticException("fondos insuficientes.");
            }
            saldo -= retiro;
            System.out.println("retiro exitoso.");
            System.out.println("nuevo saldo: $" + saldo);
        } catch (InputMismatchException e) {
            System.out.println("error: debe ingresar un numero valido.");
        } catch (ArithmeticException e) {
            System.out.println("error: " + e.getMessage());
        } finally {
            System.out.println("la operacion bancaria ha finalizado.");
            System.out.println("gracias por usar el sistema bancario.");
            scanner.close();
        }
    }
}