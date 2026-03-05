package if_mas_else_if_decisiones_multiples;
import java.util.Scanner;
public class clasificar_triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese el lado 1 del triangulo: ");
        int lado1 = scanner.nextInt();
        System.out.print("ingrese el lado 2 del triangulo: ");
        int lado2 = scanner.nextInt();
        System.out.print("ingrese el lado 3 del triangulo: ");
        int lado3 = scanner.nextInt();
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("el triangulo es equilatero.");
        } 
        else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("el triangulo es isosceles.");
        } 
        else {
            System.out.println("el triangulo es escaleno.");
        }
        scanner.close();
    }
}