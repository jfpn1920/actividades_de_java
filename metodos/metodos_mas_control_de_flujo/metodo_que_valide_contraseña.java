package metodos_mas_control_de_flujo;
import java.util.Scanner;
public class metodo_que_valide_contraseña {
    public static void validarContrasena(String contrasena) {
        String contrasenaCorrecta = "12345";
        if (contrasena.equals(contrasenaCorrecta)) {
            System.out.println("contraseña correcta, acceso permitido.");
        } else {
            System.out.println("contraseña incorrecta, acceso denegado.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese la contraseña: ");
        String contrasenaUsuario = scanner.nextLine();
        validarContrasena(contrasenaUsuario);
        scanner.close();
    }
}