package metodos_mas_bucles;
import java.util.Scanner;
public class metodo_que_valide_contraseña_con_do_while {
    public static void validarContrasena() {
        Scanner scanner = new Scanner(System.in);
        String contrasenaCorrecta = "1234";
        String contrasena;
        do {
            System.out.print("ingrese la contraseña: ");
            contrasena = scanner.nextLine();
            if (!contrasena.equals(contrasenaCorrecta)) {
                System.out.println("contraseña incorrecta, intente nuevamente.");
            }
        } while (!contrasena.equals(contrasenaCorrecta));
        System.out.println("contraseña correcta, acceso permitido.");
        scanner.close();
    }
    public static void main(String[] args) {
        validarContrasena();
    }
}