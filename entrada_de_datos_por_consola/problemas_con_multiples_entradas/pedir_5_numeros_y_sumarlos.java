package problemas_con_multiples_entradas;
import java.util.Scanner;
public class pedir_5_numeros_y_sumarlos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int suma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("ingrese el numero " + i + ": ");
            int numero = entrada.nextInt();
            suma += numero;
        }
        System.out.println("\nla suma de los 5 numeros es: " + suma);
        entrada.close();
    }
}