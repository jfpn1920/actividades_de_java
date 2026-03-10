package metodos_con_excepciones;
import java.util.Scanner;
public class metodo_que_valida_edad {
    public static void validarEdad(int edad) throws IllegalArgumentException {
        if (edad < 0 || edad > 120) {
            throw new IllegalArgumentException("error: edad invalida, debe estar entre 0 y 120.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese la edad: ");
            int edad = scanner.nextInt();
            validarEdad(edad);
            System.out.println("edad valida: " + edad);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}