package operaciones_matematicas;
import java.util.Scanner;
public class calcular_porcentaje_de_descuento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese el precio del producto: ");
        double precio = entrada.nextDouble();
        System.out.print("ingrese el porcentaje de descuento: ");
        double porcentaje = entrada.nextDouble();
        double descuento = precio * (porcentaje / 100);
        double precioFinal = precio - descuento;
        System.out.println("el descuento es: " + descuento);
        System.out.println("el precio final es: " + precioFinal);
        entrada.close();
    }
}