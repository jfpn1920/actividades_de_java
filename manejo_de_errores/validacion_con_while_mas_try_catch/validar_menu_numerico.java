package validacion_con_while_mas_try_catch;
import java.util.Scanner;
import java.util.InputMismatchException;
public class validar_menu_numerico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println("menu principal");
                System.out.println("1. ver perfil");
                System.out.println("2. configuracion");
                System.out.println("3. salir");
                System.out.print("seleccione una opcion: ");
                opcion = scanner.nextInt();
                if (opcion >= 1 && opcion <= 3) {
                    valido = true;
                } else {
                    System.out.println("error: debe elegir una opcion entre 1 y 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("error: debe ingresar un numero valido.");
                scanner.next(); 
            }
        }
        System.out.println("opcion seleccionada: " + opcion);
        scanner.close();
    }
}