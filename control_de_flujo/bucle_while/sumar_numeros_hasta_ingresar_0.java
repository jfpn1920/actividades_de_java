package bucle_while;
import java.util.Scanner;
public class sumar_numeros_hasta_ingresar_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;
        System.out.println("Ingrese números para sumarlos. Ingrese 0 para terminar.");
        while (true) {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            suma += numero;
        }
        System.out.println("La suma total es: " + suma);
        scanner.close();
    }
}