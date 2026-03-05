package bucle_for_fundamentos;
import java.util.Scanner;
public class calcular_factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un numero para calcular su factorial: ");
        int numero = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("el factorial de " + numero + " es: " + factorial);
        scanner.close();
    }
}