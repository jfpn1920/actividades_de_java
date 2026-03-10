package lanzar_excepciones_throw;
import java.util.Scanner;
public class sistema_academico_con_validacion {
    public static void validarNota(double nota) throws IllegalArgumentException {
        if (nota < 0 || nota > 5) {
            throw new IllegalArgumentException("error: la nota debe estar entre 0 y 5.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese la nota del estudiante del 0 al 5: ");
            double nota = scanner.nextDouble();
            validarNota(nota);
            System.out.println("nota registrada correctamente: " + nota);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}