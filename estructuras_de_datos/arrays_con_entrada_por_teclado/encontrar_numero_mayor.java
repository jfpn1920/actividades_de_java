package arrays_con_entrada_por_teclado;
import java.util.Scanner;
public class encontrar_numero_mayor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("ingrese el numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        System.out.println("el numero mayor es: " + mayor);
        entrada.close();
    }
}