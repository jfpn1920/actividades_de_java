package if_mas_else;
import java.util.Scanner;
public class validar_contraseña_correcta_o_incorrecta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contraseñaCorrecta = "1234";
        System.out.print("Ingrese la contraseña: ");
        String contraseñaIngresada = scanner.nextLine();
        if (contraseñaIngresada.equals(contraseñaCorrecta)) {
            System.out.println("Contraseña correcta.");
        } else {
            System.out.println("Contraseña incorrecta.");
        }
        scanner.close();
    }
}