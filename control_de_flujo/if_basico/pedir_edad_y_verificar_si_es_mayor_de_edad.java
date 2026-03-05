package if_basico;
import java.util.Scanner;
public class pedir_edad_y_verificar_si_es_mayor_de_edad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese su edad: ");
        int edad = scanner.nextInt();
        if (edad >= 18) {
            System.out.println("es mayor de edad.");
        }
        scanner.close();
    }
}