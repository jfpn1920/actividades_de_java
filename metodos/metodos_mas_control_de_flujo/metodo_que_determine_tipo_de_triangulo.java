package metodos_mas_control_de_flujo;
import java.util.Scanner;
public class metodo_que_determine_tipo_de_triangulo {
    public static void determinarTriangulo(int lado1, int lado2, int lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("el triangulo es equilatero");
        } 
        else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("el triangulo es isosceles");
        } 
        else {
            System.out.println("el triangulo es escaleno");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese el lado 1: ");
        int lado1 = scanner.nextInt();
        System.out.print("ingrese el lado 2: ");
        int lado2 = scanner.nextInt();
        System.out.print("ingrese el lado 3: ");
        int lado3 = scanner.nextInt();
        determinarTriangulo(lado1, lado2, lado3);
        scanner.close();
    }
}