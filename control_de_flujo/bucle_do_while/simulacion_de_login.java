package bucle_do_while;
import java.util.Scanner;
public class simulacion_de_login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuarioCorrecto = "admin";
        String contraseñaCorrecta = "1234";
        String usuarioIngresado;
        String contraseñaIngresada;
        System.out.println("simulacion de login");
        do {
            System.out.print("ingrese usuario: ");
            usuarioIngresado = scanner.nextLine();
            System.out.print("ingrese contraseña: ");
            contraseñaIngresada = scanner.nextLine();
            if (!usuarioIngresado.equals(usuarioCorrecto) || !contraseñaIngresada.equals(contraseñaCorrecta)) {
                System.out.println("usuario o contraseña incorrectos, intente de nuevo.\n");
            }
        } while (!usuarioIngresado.equals(usuarioCorrecto) || !contraseñaIngresada.equals(contraseñaCorrecta));
        System.out.println("login exitoso, bienvenido, " + usuarioIngresado + ".");
        scanner.close();
    }
}