package arrays_con_entrada_por_teclado;
import java.util.Scanner;
public class pedir_5_numeros_y_guardarlos {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("ingrese el numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        System.out.println("los numeros fueron guardados correctamente.");
    }
}