package problemas_con_multiples_entradas;
import java.util.Scanner;
public class pedir_datos_de_3_productos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("\n producto " + i + " ");
            System.out.print("ingrese el nombre del producto: ");
            String nombre = entrada.nextLine();
            System.out.print("ingrese la cantidad: ");
            int cantidad = entrada.nextInt();
            System.out.print("ingrese el precio unitario: ");
            double precio = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("\n datos del producto " + i + ":");
            System.out.println("nombre: " + nombre);
            System.out.println("cantidad: " + cantidad);
            System.out.println("precio unitario: " + precio);
            System.out.println("subtotal: " + (cantidad * precio));
        }
        entrada.close();
    }
}