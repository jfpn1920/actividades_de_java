package fundamentos_de_scanner;
import java.util.Scanner;
public class pedir_estatura_y_mostrarla {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese su estatura: ");
        double estatura = entrada.nextDouble();
        System.out.println("su estatura es: " + estatura);
        entrada.close();
    }
}