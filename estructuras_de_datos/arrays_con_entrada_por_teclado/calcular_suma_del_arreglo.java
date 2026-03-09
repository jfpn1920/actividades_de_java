package arrays_con_entrada_por_teclado;
import java.util.Scanner;
public class calcular_suma_del_arreglo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("ingrese el numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        System.out.println("la suma de los numeros es: " + suma);
        entrada.close();
    }
}