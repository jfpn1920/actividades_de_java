package validacion_con_while_mas_try_catch;
import java.util.Scanner;
import java.util.InputMismatchException;
public class pedir_numero_mayor_a_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print("ingrese un numero mayor a 0: ");
                numero = scanner.nextInt();
                if (numero > 0) {
                    valido = true;
                } else {
                    System.out.println("error: el numero debe ser mayor a 0.");
                }
            } catch (InputMismatchException e) {
                System.out.println("error: debe ingresar un numero valido.");
                scanner.next(); 
            }
        }
        System.out.println("numero valido ingresado: " + numero);
        scanner.close();
    }
}