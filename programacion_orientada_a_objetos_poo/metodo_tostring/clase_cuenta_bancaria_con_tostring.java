package metodo_tostring;
class CuentaBancaria {
    String titular;
    String numeroCuenta;
    double saldo;
    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    @Override
    public String toString() {
        return "titular: " + titular + 
            ", numero de cuenta: " + numeroCuenta + 
            ", saldo: $" + saldo;
    }
}
public class clase_cuenta_bancaria_con_tostring {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("juan", "123456789", 1500.75);
        System.out.println(cuenta1);
    }
}