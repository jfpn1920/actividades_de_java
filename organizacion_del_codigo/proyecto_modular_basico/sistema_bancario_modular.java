package proyecto_modular_basico;
public class sistema_bancario_modular {
    public static void main(String[] args) {
        double saldo = obtenerSaldoInicial();
        double deposito = obtenerDeposito();
        saldo = realizarDeposito(saldo, deposito);
        mostrarSaldoFinal(saldo);
    }
    public static double obtenerSaldoInicial() {
        return 1000.0;
    }
    public static double obtenerDeposito() {
        return 500.0;
    }
    public static double realizarDeposito(double saldoActual, double deposito) {
        return saldoActual + deposito;
    }
    public static void mostrarSaldoFinal(double saldo) {
        System.out.println("el saldo final en la cuenta es: $" + saldo);
    }
}