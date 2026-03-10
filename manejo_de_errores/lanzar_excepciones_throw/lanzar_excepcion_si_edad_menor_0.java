package lanzar_excepciones_throw;
import java.util.Scanner;
public class lanzar_excepcion_si_edad_menor_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese su edad: ");
            int edad = scanner.nextInt();
            if (edad < 0) {
                throw new IllegalArgumentException("error: la edad no puede ser negativa.");
            }
            System.out.println("edad ingresada correctamente: " + edad);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}