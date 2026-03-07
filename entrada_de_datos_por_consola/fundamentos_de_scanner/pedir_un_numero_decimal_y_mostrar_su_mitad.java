package fundamentos_de_scanner;
import java.util.Scanner;
public class pedir_un_numero_decimal_y_mostrar_su_mitad {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese un numero decimal: ");
        double numero = entrada.nextDouble();
        double mitad = numero / 2;
        System.out.println("la mitad del numero es: " + mitad);
        entrada.close();
    }
}