package lanzar_excepciones_throw;
import java.util.Scanner;
class MiExcepcionPersonalizada extends Exception {
    public MiExcepcionPersonalizada(String mensaje) {
        super(mensaje);
    }
}
public class lanzar_excepcion_personalizada_simple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese un numero positivo: ");
            int numero = scanner.nextInt();
            if (numero <= 0) {
                throw new MiExcepcionPersonalizada("error: El numero debe ser mayor que 0.");
            }
            System.out.println("numero ingresado correctamente: " + numero);
        } catch (MiExcepcionPersonalizada e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}