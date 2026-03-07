package fundamentos_de_scanner;
import java.util.Scanner;
public class pedir_edad_y_mostrarla {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese su edad: ");
        int edad = entrada.nextInt();
        System.out.println("tu edad es: " + edad);
        entrada.close();
    }
}