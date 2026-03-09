package arrays_con_entrada_por_teclado;
import java.util.Scanner;
public class calcular_promedio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;
        double promedio;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("ingrese el numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        promedio = (double) suma / numeros.length;
        System.out.println("el promedio de los numeros es: " + promedio);
        entrada.close();
    }
}