package bucle_for_fundamentos;
import java.util.Scanner;
public class pedir_5_numeros_y_sumarlos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        System.out.println("ingrese 5 numeros para sumarlos:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("numero " + i + ": ");
            int numero = scanner.nextInt();
            suma += numero; 
        }
        System.out.println("la suma de los 5 numeros es: " + suma);
        scanner.close();
    }
}