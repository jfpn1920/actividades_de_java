package metodos_con_excepciones;
import java.util.Scanner;
public class metodo_que_divide_numeros {
    public static double dividir(int numerador, int denominador) throws ArithmeticException {
        if (denominador == 0) {
            throw new ArithmeticException("error: division por cero no permitida.");
        }
        return (double) numerador / denominador;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese el numerador: ");
            int numerador = scanner.nextInt();
            System.out.print("ingrese el denominador: ");
            int denominador = scanner.nextInt();
            double resultado = dividir(numerador, denominador);
            System.out.println("resultado de la division: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}