package metodos_con_excepciones;
import java.util.Scanner;
public class metodo_que_valida_saldo {
    public static void validarSaldo(double saldo) throws IllegalArgumentException {
        if (saldo < 0) {
            throw new IllegalArgumentException("error: el saldo no puede ser negativo.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese el saldo: ");
            double saldo = scanner.nextDouble();
            validarSaldo(saldo);
            System.out.println("saldo valido ingresado: " + saldo);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}