package bucle_while;
import java.util.Scanner;
public class validar_edad_hasta_que_sea_valida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad;
        do {
            System.out.print("ingrese su edad (0-120): ");
            edad = scanner.nextInt();
            if (edad < 0 || edad > 120) {
                System.out.println("edad no valida, intente de nuevo.");
            }
        } while (edad < 0 || edad > 120);
        System.out.println("¡edad valida ingresada: " + edad + "!");
        scanner.close();
    }
}