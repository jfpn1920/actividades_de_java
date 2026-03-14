package refactorizacion_de_practica.separarlo_en_paquetes;
import java.util.Scanner;
public class entrada_de_datos {
    private static final Scanner scanner = new Scanner(System.in);
    public static String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }
    public static double leerDouble(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }
    public static void cerrarScanner() {
        scanner.close();
    }
}