package nivel_de_practica;
import java.util.Scanner;
public class compilacion_y_ejecucion_completa_desde_consola {
    public static void main(String[] args) {
        ejecutarPrograma();
    }
    public static void ejecutarPrograma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" menu de navegacion ");
        System.out.print("ingrese su nombre: ");
        String nombre = scanner.nextLine();
        saludar(nombre);
        scanner.close();
    }
    public static void saludar(String nombre) {
        System.out.println("hola " + nombre + ", el programa se ejecuto correctamente desde la consola.");
    }
}