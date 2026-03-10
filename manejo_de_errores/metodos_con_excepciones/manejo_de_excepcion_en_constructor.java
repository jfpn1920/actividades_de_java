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
    public double getSaldo() {
        return saldo;
    }
}
public class manejo_de_excepcion_en_constructor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese el saldo inicial para la cuenta: ");
            double saldo = scanner.nextDouble();
            Cuenta cuenta = new Cuenta(saldo);
            System.out.println("cuenta creada con saldo: " + cuenta.getSaldo());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}