package nivel_de_practica;
import java.util.Scanner;
import java.util.InputMismatchException;
public class manejo_de_errores {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ejecutarPrograma();
    }
    public static void ejecutarPrograma() {
        try {
            int numero1 = pedirNumero("ingrese el primer numero: ");
            int numero2 = pedirNumero("ingrese el segundo numero: ");
            int resultado = dividir(numero1, numero2);
            System.out.println("el resultado de la division es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("error: no se puede dividir entre cero.");
        } catch (InputMismatchException e) {
            System.out.println("error: debe ingresar solo numeros.");
        } catch (Exception e) {
            System.out.println("ocurrio un error inesperado.");
        }
    }
    public static int pedirNumero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }
    public static int dividir(int a, int b) {
        return a / b;
    }
}