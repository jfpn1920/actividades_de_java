package bucle_do_while;
import java.util.Scanner;
public class sistema_de_encuesta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;
        String continuar;
        System.out.println("sistema de encuesta");
        do {
            System.out.print("¿esta satisfecho con nuestro servicio? (si/no): ");
            respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("si")) {
                System.out.println("¡gracias por su comentario positivo!");
            } else if (respuesta.equalsIgnoreCase("no")) {
                System.out.println("gracias por su comentario, trabajaremos para mejorar.");
            } else {
                System.out.println("respuesta no valida, por favor responda 'si' o 'no'.");
            }
            System.out.print("¿desea que otra persona responda la encuesta? (s/n): ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("s"));
        System.out.println("encuesta finalizada, ¡gracias por participar!");
        scanner.close();
    }
}