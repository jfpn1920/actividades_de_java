package el_uso_del_break;
import java.util.Scanner;
public class salir_si_contraseña_correcta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contraseñaCorrecta = "java123";
        String contraseñaIngresada;
        while (true) {
            System.out.print("ingrese la contraseña: ");
            contraseñaIngresada = scanner.nextLine();
            if (contraseñaIngresada.equals(contraseñaCorrecta)) {
                System.out.println("contraseña correcta, acceso permitido.");
                break;
            } else {
                System.out.println("contraseña incorrecta, intente nuevamente.");
            }
        }
        scanner.close();
    }
}