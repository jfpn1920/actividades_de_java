package clases_y_objetos_fundamentos;
class CuentaBancaria {
    String titular;
    String numeroCuenta;
    double saldo;
}
public class crear_clase_cuenta_bancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.titular = "juan perez";
        cuenta1.numeroCuenta = "123456789";
        cuenta1.saldo = 1500.75;
        System.out.println("titular: " + cuenta1.titular);
        System.out.println("numero de cuenta: " + cuenta1.numeroCuenta);
        System.out.println("saldo: $" + cuenta1.saldo);
    }
}