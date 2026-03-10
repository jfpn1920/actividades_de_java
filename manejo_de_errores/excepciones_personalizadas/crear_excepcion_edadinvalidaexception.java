package excepciones_personalizadas;
import java.util.Scanner;
class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}
public class crear_excepcion_edadinvalidaexception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese su edad: ");
            int edad = scanner.nextInt();
            validarEdad(edad);
            System.out.println("edad valida ingresada: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println("excepcion capturada: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad <= 0 || edad > 120) {
            throw new EdadInvalidaException("edad invalida: debe estar entre 1 y 120.");
        }
    }
}