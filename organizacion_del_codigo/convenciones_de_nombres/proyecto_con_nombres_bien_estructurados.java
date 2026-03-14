package convenciones_de_nombres;
import java.util.Scanner;
public class proyecto_con_nombres_bien_estructurados {
    public static final int EDAD_MINIMA = 18;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreUsuario = pedirNombreUsuario(scanner);
        int edadUsuario = pedirEdadUsuario(scanner);
        verificarEdadUsuario(nombreUsuario, edadUsuario);
        scanner.close();
    }
    public static String pedirNombreUsuario(Scanner scanner) {
        System.out.print("ingrese su nombre: ");
        return scanner.nextLine();
    }
    public static int pedirEdadUsuario(Scanner scanner) {
        System.out.print("ingrese su edad: ");
        return scanner.nextInt();
    }
    public static void verificarEdadUsuario(String nombreUsuario, int edadUsuario) {
        if (edadUsuario >= EDAD_MINIMA) {
            System.out.println(nombreUsuario + ", eres mayor de edad.");
        } else {
            System.out.println(nombreUsuario + ", eres menor de edad.");
        }
    }
}