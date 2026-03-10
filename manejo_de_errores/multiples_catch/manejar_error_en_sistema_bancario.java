package multiples_catch;
import java.util.Scanner;
import java.util.InputMismatchException;
public class manejar_error_en_sistema_bancario {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.0;
        try {
            System.out.println("saldo actual: $" + saldo);
            System.out.print("ingrese el monto a retirar: ");
            double retiro = scanner.nextDouble();
            if (retiro > saldo) {
                throw new ArithmeticException();
            }
            saldo -= retiro;
            System.out.println("retiro realizado correctamente.");
            System.out.println("nuevo saldo: $" + saldo);
        } catch (InputMismatchException e) {
            System.out.println("error: debe ingresar un monto numerico valido.");
        } catch (ArithmeticException e) {
            System.out.println("error: fondos insuficientes para realizar el retiro.");
        } catch (Exception e) {
            System.out.println("error: ocurrio un problema en el sistema bancario.");
        }
        scanner.close();
    }
}