package el_uso_del_break;
import java.util.Scanner;
public class buscar_numero_en_lista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {5, 12, 7, 20, 3, 15, 9};
        int numeroBuscar;
        boolean encontrado = false;
        System.out.print("ingrese el numero que desea buscar: ");
        numeroBuscar = scanner.nextInt();
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscar) {
                System.out.println("numero encontrado en la posicion: " + i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("el numero no se encuentra en la lista.");
        }
        scanner.close();
    }
}