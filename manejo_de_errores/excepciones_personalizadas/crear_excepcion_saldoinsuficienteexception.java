package excepciones_personalizadas;
import java.util.Scanner;
class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}
class Cuenta {
    private double saldo;
    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    public void retirar(double cantidad) throws SaldoInsuficienteException {
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("error: saldo insuficiente, saldo actual: " + saldo);
        }
        saldo -= cantidad;
    }
    public double getSaldo() {
        return saldo;
    }
    public void depositar(double cantidad) {
        saldo += cantidad;
    }
}
public class crear_excepcion_saldoinsuficienteexception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese saldo inicial de la cuenta: ");
            double saldoInicial = scanner.nextDouble();
            Cuenta cuenta = new Cuenta(saldoInicial);
            System.out.print("ingrese cantidad a retirar: ");
            double retiro = scanner.nextDouble();
            cuenta.retirar(retiro);
            System.out.println("retiro exitoso, saldo restante: " + cuenta.getSaldo());
        } catch (SaldoInsuficienteException e) {
            System.out.println("excepcion capturada: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}