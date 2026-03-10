package multiples_catch;
import java.util.Scanner;
import java.util.InputMismatchException;
public class manejar_error_en_sistema_de_notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese la cantidad de notas: ");
            int cantidad = scanner.nextInt();
            double suma = 0;
            for (int i = 1; i <= cantidad; i++) {
                System.out.print("ingrese la nota " + i + ": ");
                double nota = scanner.nextDouble();
                suma += nota;
            }
            double promedio = suma / cantidad;
            System.out.println("el promedio de las notas es: " + promedio);
        } catch (InputMismatchException e) {
            System.out.println("error: debe ingresar valores numericos para las notas.");
        } catch (ArithmeticException e) {
            System.out.println("error: la cantidad de notas no puede ser cero.");
        }
        scanner.close();
    }
}