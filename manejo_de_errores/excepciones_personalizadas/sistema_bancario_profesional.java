package excepciones_personalizadas;
import java.util.Scanner;
class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}
class Cuenta {
    private double saldo;
    public Cuenta(double saldoInicial) throws IllegalArgumentException {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("saldo inicial no puede ser negativo.");
        }
        this.saldo = saldoInicial;
    }
    public void depositar(double cantidad) throws IllegalArgumentException {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("el deposito debe ser mayor a 0.");
        }
        saldo += cantidad;
    }
    public void retirar(double cantidad) throws SaldoInsuficienteException, IllegalArgumentException {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("el retiro debe ser mayor a 0.");
        }
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("saldo insuficiente, saldo actual: " + saldo);
        }
        saldo -= cantidad;
    }
    public double getSaldo() {
        return saldo;
    }
}
public class sistema_bancario_profesional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese saldo inicial de la cuenta: ");
            double saldoInicial = scanner.nextDouble();
            Cuenta cuenta = new Cuenta(saldoInicial);
            boolean continuar = true;
            while (continuar) {
                System.out.println("\n menu del banco ");
                System.out.println("1. consultar saldo");
                System.out.println("2. depositar");
                System.out.println("3. retirar");
                System.out.println("4. salir");
                System.out.print("seleccione una opcion: ");
                int opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("saldo actual: " + cuenta.getSaldo());
                        break;
                    case 2:
                        System.out.print("ingrese monto a depositar: ");
                        double deposito = scanner.nextDouble();
                        cuenta.depositar(deposito);
                        System.out.println("deposito exitoso, saldo actual: " + cuenta.getSaldo());
                        break;
                    case 3:
                        System.out.print("ingrese monto a retirar: ");
                        double retiro = scanner.nextDouble();
                        cuenta.retirar(retiro);
                        System.out.println("retiro exitoso, saldo actual: " + cuenta.getSaldo());
                        break;
                    case 4:
                        System.out.println("gracias por usar el sistema bancario.");
                        continuar = false;
                        break;
                    default:
                        System.out.println("opcion invalida, intente de nuevo.");
                }
            }
        } catch (SaldoInsuficienteException e) {
            System.out.println("error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}