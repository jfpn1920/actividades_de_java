package excepciones_personalizadas;
import java.util.Scanner;
class OperacionInvalidaException extends Exception {
    public OperacionInvalidaException(String mensaje) {
        super(mensaje);
    }
}
public class manejar_error_con_mensaje_personalizado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese el numerador: ");
            int numerador = scanner.nextInt();
            System.out.print("ingrese el denominador: ");
            int denominador = scanner.nextInt();
            int resultado = dividir(numerador, denominador);
            System.out.println("resultado: " + resultado);
        } catch (OperacionInvalidaException e) {
            System.out.println("excepcion capturada: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    static int dividir(int numerador, int denominador) throws OperacionInvalidaException {
        if (denominador == 0) {
            throw new OperacionInvalidaException("no se puede dividir entre cero, por favor ingrese un denominador valido.");
        }
        return numerador / denominador;
    }
}