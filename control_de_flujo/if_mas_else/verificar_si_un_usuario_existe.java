package if_mas_else;
import java.util.Scanner;
public class verificar_si_un_usuario_existe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuarioRegistrado = "admin";
        System.out.print("ingrese el usuario: ");
        String usuarioIngresado = scanner.nextLine();
        if (usuarioIngresado.equals(usuarioRegistrado)) {
            System.out.println("el usuario existe.");
        } else {
            System.out.println("el usuario no existe.");
        }
        scanner.close();
    }
}