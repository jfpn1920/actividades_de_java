package proyecto_modular_basico;
import java.util.Scanner;
public class ejecucion_desde_consola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre = leerNombre(scanner);
        int edad = leerEdad(scanner);
        mostrarInformacion(nombre, edad);
        scanner.close();
    }
    public static String leerNombre(Scanner scanner) {
        System.out.print("ingrese su nombre: ");
        return scanner.nextLine();
    }
    public static int leerEdad(Scanner scanner) {
        int edad = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print("ingrese su edad: ");
                edad = scanner.nextInt();
                valido = true;
            } catch (Exception e) {
                System.out.println("error: ingrese un numero válido.");
                scanner.nextLine(); 
            }
        }
        return edad;
    }
    public static void mostrarInformacion(String nombre, int edad) {
        System.out.println("\n informacion del usuario ");
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
    }
}