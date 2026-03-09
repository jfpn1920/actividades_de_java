package arrays_con_entrada_por_teclado;
import java.util.Scanner;
public class invertir_arreglo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("ingrese el numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        System.out.println("el arreglo invertido es:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
        entrada.close();
    }
}