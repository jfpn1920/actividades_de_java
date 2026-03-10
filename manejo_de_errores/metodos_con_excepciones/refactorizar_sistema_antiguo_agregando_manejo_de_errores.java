package metodos_con_excepciones;
import java.util.Scanner;
class Cuenta {
    private double saldo;
    public Cuenta(double saldoInicial) throws IllegalArgumentException {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("error: el saldo inicial no puede ser negativo.");
        }
        this.saldo = saldoInicial;
    }
    public void depositar(double cantidad) throws IllegalArgumentException {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("error: el deposito debe ser mayor que 0.");
        }
        saldo += cantidad;
    }
    public void retirar(double cantidad) throws IllegalArgumentException {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("error: el retiro debe ser mayor que 0.");
        }
        if (cantidad > saldo) {
            throw new IllegalArgumentException("error: no hay suficiente saldo para retirar.");
        }
        saldo -= cantidad;
    }
    public double getSaldo() {
        return saldo;
    }
}
public class refactorizar_sistema_antiguo_agregando_manejo_de_errores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese saldo inicial: ");
            double saldoInicial = scanner.nextDouble();
            Cuenta cuenta = new Cuenta(saldoInicial);
            System.out.print("ingrese cantidad a depositar: ");
            double deposito = scanner.nextDouble();
            cuenta.depositar(deposito);
            System.out.print("ingrese cantidad a retirar: ");
            double retiro = scanner.nextDouble();
            cuenta.retirar(retiro);
            System.out.println("saldo final: " + cuenta.getSaldo());
        } catch (IllegalArgumentException e) {
            System.out.println("error manejado: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}