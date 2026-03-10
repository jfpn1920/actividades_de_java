package metodos_con_excepciones;
import java.util.Scanner;
class SaldoNegativoException extends Exception {
    public SaldoNegativoException(String mensaje) {
        super(mensaje);
    }
}
public class metodo_que_lanza_excepcion_personalizada {
    public static void validarSaldo(double saldo) throws SaldoNegativoException {
        if (saldo < 0) {
            throw new SaldoNegativoException("error personalizado: el saldo no puede ser negativo.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese el saldo: ");
            double saldo = scanner.nextDouble();
            validarSaldo(saldo);
            System.out.println("saldo valido ingresado: " + saldo);
        } catch (SaldoNegativoException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}