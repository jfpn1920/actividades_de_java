package casos_mas_reales;
import java.util.Scanner;
public class sistema_de_login_simple {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String usuarioCorrecto = "admin";
        String contrasenaCorrecta = "1234";
        System.out.print("ingrese su usuario: ");
        String usuario = entrada.nextLine();
        System.out.print("ingrese su contraseña: ");
        String contrasena = entrada.nextLine();
        if(usuario.equals(usuarioCorrecto) && contrasena.equals(contrasenaCorrecta)) {
            System.out.println("\n login exitoso, bienvenido " + usuario);
        } else {
            System.out.println("\n usuario o contraseña incorrectos, intente de nuevo.");
        }
        entrada.close();
    }
}