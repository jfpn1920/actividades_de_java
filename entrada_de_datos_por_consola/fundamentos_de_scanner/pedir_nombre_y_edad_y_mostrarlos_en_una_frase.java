package fundamentos_de_scanner;
import java.util.Scanner;
public class pedir_nombre_y_edad_y_mostrarlos_en_una_frase {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("ingrese su edad: ");
        int edad = entrada.nextInt();
        System.out.println("hola " + nombre + ", tienes " + edad + " años.");
        entrada.close();
    }
}