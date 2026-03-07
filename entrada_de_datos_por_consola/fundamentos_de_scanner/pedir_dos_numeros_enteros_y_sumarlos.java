package fundamentos_de_scanner;
import java.util.Scanner;
public class pedir_dos_numeros_enteros_y_sumarlos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese el primer numero: ");
        int numero1 = entrada.nextInt();
        System.out.print("ingrese el segundo numero: ");
        int numero2 = entrada.nextInt();
        int suma = numero1 + numero2;
        System.out.println("la suma es: " + suma);
        entrada.close();
    }
}