package uso_de_try_y_catch_basico;
import java.util.Scanner;
public class capturar_indice_invalido_en_arreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {10, 20, 30, 40, 50};
        try {
            System.out.print("ingrese el indice del arreglo: ");
            int indice = scanner.nextInt();
            System.out.println("el valor en esa posicion es: " + numeros[indice]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error: el indice ingresado esta fuera del rango del arreglo.");
        }
        scanner.close();
    }
}