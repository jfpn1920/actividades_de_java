package mini_sistemas_con_metodos;
import java.util.Scanner;
public class sistema_de_login {
    public static boolean validarLogin(String usuario, String contrasena) {
        String usuarioCorrecto = "admin";
        String contrasenaCorrecta = "1234";
        if (usuario.equals(usuarioCorrecto) && contrasena.equals(contrasenaCorrecta)) {
            return true;
        } else {
            return false;
        }
    }
    public static void iniciarSesion(Scanner scanner) {
        System.out.print("ingrese el usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("ongrese la contraseña: ");
        String contrasena = scanner.nextLine();
        boolean acceso = validarLogin(usuario, contrasena);
        if (acceso) {
            System.out.println("acceso permitido, bienvenido.");
        } else {
            System.out.println("acceso denegado, usuario o contraseña incorrectos.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        iniciarSesion(scanner);
        scanner.close();
    }
}