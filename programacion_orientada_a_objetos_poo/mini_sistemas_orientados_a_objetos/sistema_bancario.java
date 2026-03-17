package mini_sistemas_orientados_a_objetos;
class CuentaBancaria {
    String titular;
    double saldo;
    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    public void depositar(double cantidad) {
        saldo = saldo + cantidad;
        System.out.println("deposito realizado: $" + cantidad);
    }
    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo = saldo - cantidad;
            System.out.println("retiro realizado: $" + cantidad);
        } else {
            System.out.println("saldo insuficiente");
        }
    }
    public void mostrarSaldo() {
        System.out.println("titular: " + titular);
        System.out.println("saldo actual: $" + saldo);
        System.out.println("---------------------");
    }
}
public class sistema_bancario {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("juan", 1000);
        cuenta1.mostrarSaldo();
        cuenta1.depositar(500);
        cuenta1.retirar(300);
        cuenta1.mostrarSaldo();
    }
}