package if_mas_else;
import java.util.Scanner;
public class comparar_dos_numeros_y_mostrar_el_mayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese el primer numero: ");
        double numero1 = scanner.nextDouble();
        System.out.print("ingrese el segundo numero: ");
        double numero2 = scanner.nextDouble();
        if (numero1 > numero2) {
            System.out.println("el numero mayor es: " + numero1);
        } else {
            System.out.println("el numero mayor es: " + numero2);
        }
        scanner.close();
    }
}