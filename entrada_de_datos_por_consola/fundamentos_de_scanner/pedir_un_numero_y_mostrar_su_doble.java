package fundamentos_de_scanner;
import java.util.Scanner;
public class pedir_un_numero_y_mostrar_su_doble {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        int numero = entrada.nextInt();
        int doble = numero * 2;
        System.out.println("el doble del numero es: " + doble);
        entrada.close();
    }
}