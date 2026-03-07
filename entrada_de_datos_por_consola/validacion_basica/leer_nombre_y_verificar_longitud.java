package validacion_basica;
import java.util.Scanner;
public class leer_nombre_y_verificar_longitud {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese su nombre: ");
        String nombre = entrada.nextLine();
        if (nombre.length() > 5) {
            System.out.println("el nombre es largo.");
        } else if (nombre.length() == 5) {
            System.out.println("el nombre tiene 5 caracteres.");
        } else {
            System.out.println("el nombre es corto.");
        }
        entrada.close();
    }
}