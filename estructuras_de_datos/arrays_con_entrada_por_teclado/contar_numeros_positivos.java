package arrays_con_entrada_por_teclado;
import java.util.Scanner;
public class contar_numeros_positivos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];
        int contadorPositivos = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("ingrese el numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                contadorPositivos++;
            }
        }
        System.out.println("cantidad de numeros positivos: " + contadorPositivos);
        entrada.close();
    }
}