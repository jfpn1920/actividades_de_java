package validacion_con_while_mas_try_catch;
import java.util.Scanner;
import java.util.InputMismatchException;
public class simular_cajero_seguro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pinCorrecto = 1234;
        int pinIngresado = 0;
        int intentos = 0;
        int maxIntentos = 3;
        boolean acceso = false;
        while (intentos < maxIntentos && !acceso) {
            try {
                System.out.print("ingrese su pin: ");
                pinIngresado = scanner.nextInt();
                if (pinIngresado == pinCorrecto) {
                    acceso = true;
                    System.out.println("acceso concedido, bienvenido al cajero.");
                } else {
                    intentos++;
                    System.out.println("pin incorrecto.");
                    System.out.println("intentos restantes: " + (maxIntentos - intentos));
                }
            } catch (InputMismatchException e) {
                System.out.println("error: debe ingresar un pin numerico.");
                scanner.next(); 
            }
        }
        if (!acceso) {
            System.out.println("tarjeta bloqueada por demasiados intentos.");
        }
        scanner.close();
    }
}