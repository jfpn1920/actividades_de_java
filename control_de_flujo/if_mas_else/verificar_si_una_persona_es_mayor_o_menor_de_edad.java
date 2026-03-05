package if_mas_else;
import java.util.Scanner;
public class verificar_si_una_persona_es_mayor_o_menor_de_edad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese su edad: ");
        int edad = scanner.nextInt();
        if (edad >= 18) {
            System.out.println("es mayor de edad.");
        } else {
            System.out.println("es menor de edad.");
        }
        scanner.close();
    }
}