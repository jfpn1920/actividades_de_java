package problemas_con_multiples_entradas;
import java.util.Scanner;
public class pedir_5_numeros_y_mostrar_mayor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int mayor = Integer.MIN_VALUE;
        for (int i = 1; i <= 5; i++) {
            System.out.print("ingrese el numero " + i + ": ");
            int numero = entrada.nextInt();
            if (numero > mayor) {
                mayor = numero;
            }
        }
        System.out.println("\n el numero mayor es: " + mayor);
        entrada.close();
    }
}