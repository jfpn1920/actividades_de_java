package if_basico;
import java.util.Scanner;
public class pedir_contraseña_y_verificar_si_es_correcta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contraseñaCorrecta = "1234";
        System.out.print("ingrese la contraseña: ");
        String contraseñaIngresada = scanner.nextLine();
        if (contraseñaIngresada.equals(contraseñaCorrecta)) {
            System.out.println("contraseña correcta.");
        }
        scanner.close();
    }
}