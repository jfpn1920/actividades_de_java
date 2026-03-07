package fundamentos_de_scanner;
import java.util.Scanner;
public class pedir_el_nombre_y_mostrar_saludo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("hola " + nombre + ", bienvenido.");
        entrada.close();
    }
}