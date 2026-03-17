package nivel_de_practica;
class CuentaBancaria {
    String titular;
    double saldo;
    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("deposito realizado: $" + cantidad);
    }
    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("retiro realizado: $" + cantidad);
        } else {
            System.out.println("saldo insuficiente.");
        }
    }
    public void mostrarSaldo() {
        System.out.println("titular: " + titular);
        System.out.println("saldo actual: $" + saldo);
        System.out.println("-------------------------");
    }
}
public class sistema_bancario_modular {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("juan", 1000);
        cuenta1.mostrarSaldo();
        cuenta1.depositar(500);
        cuenta1.retirar(200);
        cuenta1.mostrarSaldo();
    }
}