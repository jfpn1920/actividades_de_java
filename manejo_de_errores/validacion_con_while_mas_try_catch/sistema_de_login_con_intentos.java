package validacion_con_while_mas_try_catch;
import java.util.Scanner;
public class sistema_de_login_con_intentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuarioCorrecto = "admin";
        String contraseñaCorrecta = "1234";
        int intentos = 0;
        int maxIntentos = 3;
        boolean acceso = false;
        while (intentos < maxIntentos && !acceso) {
            try {
                System.out.print("ingrese usuario: ");
                String usuario = scanner.nextLine();
                System.out.print("ingrese contraseña: ");
                String contraseña = scanner.nextLine();
                if (usuario.equals(usuarioCorrecto) && contraseña.equals(contraseñaCorrecta)) {
                    acceso = true;
                    System.out.println("acceso concedido, bienvenido al sistema.");
                } else {
                    intentos++;
                    System.out.println("usuario o contraseña incorrectos.");
                    System.out.println("intentos restantes: " + (maxIntentos - intentos));
                }
            } catch (Exception e) {
                System.out.println("ocurrio un error inesperado.");
            }
        }
        if (!acceso) {
            System.out.println("cuenta bloqueada por demasiados intentos.");
        }
        scanner.close();
    }
}