package problemas_tipo_mini_sistema;
import java.util.Scanner;
public class sistema_de_restaurante {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese el nombre del cliente: ");
        String cliente = entrada.nextLine();
        System.out.print("ingrese el nombre del plato: ");
        String plato = entrada.nextLine();
        System.out.print("ingrese la cantidad de platos: ");
        int cantidad = entrada.nextInt();
        System.out.print("ingrese el precio unitario: ");
        double precioUnitario = entrada.nextDouble();
        double total = cantidad * precioUnitario;
        System.out.println("\n resumen de la orden ");
        System.out.println("cliente: " + cliente);
        System.out.println("plato: " + plato);
        System.out.println("cantidad: " + cantidad);
        System.out.println("precio unitario: " + precioUnitario);
        System.out.println("total a pagar: " + total);
        entrada.close();
    }
}