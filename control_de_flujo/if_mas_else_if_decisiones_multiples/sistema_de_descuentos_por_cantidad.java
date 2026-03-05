package if_mas_else_if_decisiones_multiples;
import java.util.Scanner;
public class sistema_de_descuentos_por_cantidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese la cantidad de productos comprados: ");
        int cantidad = scanner.nextInt();
        if (cantidad < 10) {
            System.out.println("no hay descuento.");
        } 
        else if (cantidad >= 10 && cantidad < 20) {
            System.out.println("tienes un descuento del 10%.");
        } 
        else {
            System.out.println("tienes un descuento del 20%.");
        }
        scanner.close();
    }
}