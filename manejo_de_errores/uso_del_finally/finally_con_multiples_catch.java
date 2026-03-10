package uso_del_finally;
import java.util.Scanner;
import java.util.InputMismatchException;
public class finally_con_multiples_catch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese el primer numero: ");
            int num1 = scanner.nextInt();
            System.out.print("ingrese el segundo numero: ");
            int num2 = scanner.nextInt();
            int resultado = num1 / num2;
            System.out.println("resultado de la division: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("error: no se puede dividir entre cero.");
        } catch (InputMismatchException e) {
            System.out.println("error: debe ingresar solo numeros.");
        } catch (Exception e) {
            System.out.println("error general: ocurrio un problema inesperado.");
        } finally {
            System.out.println("bloque finally ejecutado: el programa ha terminado.");
            scanner.close();
        }
    }
}