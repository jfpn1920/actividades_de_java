package bucle_while;
import java.util.Scanner;
public class sistema_de_contraseña_hasta_que_sea_correcta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contraseñaCorrecta = "admin123";
        String contraseñaIngresada;
        do {
            System.out.print("ingrese la contraseña: ");
            contraseñaIngresada = scanner.nextLine();
            if (!contraseñaIngresada.equals(contraseñaCorrecta)) {
                System.out.println("contraseña incorrecta, intente de nuevo.");
            }
        } while (!contraseñaIngresada.equals(contraseñaCorrecta));
        System.out.println("¡contraseña correcta! acceso concedido.");
        scanner.close();
    }
}