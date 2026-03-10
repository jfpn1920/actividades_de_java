package lanzar_excepciones_throw;
import java.util.Scanner;
public class validar_contraseña_con_throw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese una contraseña: ");
            String contraseña = scanner.nextLine();
            if (contraseña.length() < 6) {
                throw new IllegalArgumentException("error: la contraseña debe tener al menos 6 caracteres.");
            }
            System.out.println("contraseña valida ingresada correctamente.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}