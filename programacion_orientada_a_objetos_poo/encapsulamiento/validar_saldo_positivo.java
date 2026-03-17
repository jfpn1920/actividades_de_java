package encapsulamiento;
class CuentaBancaria {
    private double saldo;
    CuentaBancaria(double saldo) {
        setSaldo(saldo); 
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("error: el saldo no puede ser negativo.");
        }
    }
}
public class validar_saldo_positivo {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria(1000);
        System.out.println("saldo inicial: " + cuenta1.getSaldo());
        cuenta1.setSaldo(500);
        System.out.println("saldo actualizado: " + cuenta1.getSaldo());
        cuenta1.setSaldo(-200);
        System.out.println("saldo despues del intento invalido: " + cuenta1.getSaldo());
    }
}