package nivel_de_practica;
import java.util.Scanner;
public class sistema_de_login_con_intentos_limitados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuarioCorrecto = "admin";
        String contraseñaCorrecta = "1234";
        String usuario;
        String contraseña;
        int intentos = 0;
        int maxIntentos = 3;
        while (intentos < maxIntentos) {
            System.out.print("ingrese usuario: ");
            usuario = scanner.nextLine();
            System.out.print("ingrese contraseña: ");
            contraseña = scanner.nextLine();
            if (usuario.equals(usuarioCorrecto) && contraseña.equals(contraseñaCorrecta)) {
                System.out.println("acceso concedido");
                break;
            } else {
                intentos++;
                System.out.println("datos incorrectos, intentos restantes: " + (maxIntentos - intentos));
            }
            if (intentos == maxIntentos) {
                System.out.println("cuenta bloqueada, demasiados intentos.");
            }
        }
        scanner.close();
    }
}