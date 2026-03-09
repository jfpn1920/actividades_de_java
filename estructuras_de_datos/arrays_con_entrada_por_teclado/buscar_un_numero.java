package arrays_con_entrada_por_teclado;
import java.util.Scanner;
public class buscar_un_numero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("ingrese el numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        System.out.print("ingrese el numero que desea buscar: ");
        int buscar = entrada.nextInt();
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscar) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("el numero se encuentra en el arreglo.");
        } else {
            System.out.println("el numero no se encuentra en el arreglo.");
        }
        entrada.close();
    }
}