package fundamentos_de_scanner;
import java.util.Scanner;
public class pedir_un_numero_y_mostrar_su_triple {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        int numero = entrada.nextInt();
        int triple = numero * 3;
        System.out.println("el triple del numero es: " + triple);
        entrada.close();
    }
}