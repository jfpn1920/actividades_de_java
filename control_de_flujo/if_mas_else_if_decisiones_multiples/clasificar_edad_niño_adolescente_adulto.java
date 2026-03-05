package if_mas_else_if_decisiones_multiples;
import java.util.Scanner;
public class clasificar_edad_niño_adolescente_adulto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese su edad: ");
        int edad = scanner.nextInt();
        if (edad >= 0 && edad <= 12) {
            System.out.println("eres un niño");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("eres un adolescente");
        } else if (edad >= 18) {
            System.out.println("eres un adulto");
        } else {
            System.out.println("edad no válida");
        }
        scanner.close();
    }
}