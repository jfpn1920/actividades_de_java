package atributos;
class CuentaBancaria {
    double saldo;
}
public class clase_cuenta_bancaria_con_saldo {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.saldo = 1500.50;
        System.out.println("saldo de la cuenta: $" + cuenta1.saldo);
    }
}