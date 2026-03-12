package metodos_mas_control_de_flujo;
import java.util.Scanner;
public class metodo_que_retorne_descuento_por_cantidad {
    public static double calcularDescuento(int cantidad, double precioUnitario) {
        double total = cantidad * precioUnitario;
        double descuento;
        if (cantidad >= 1 && cantidad <= 5) {
            descuento = total * 0.05;
        } 
        else if (cantidad <= 10) {
            descuento = total * 0.10;
        } 
        else {
            descuento = total * 0.15;
        }
        return descuento;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese la cantidad de productos: ");
        int cantidad = scanner.nextInt();
        System.out.print("ingrese el precio unitario: ");
        double precio = scanner.nextDouble();
        double descuento = calcularDescuento(cantidad, precio);
        System.out.println("el descuento aplicado es: " + descuento);
        scanner.close();
    }
}