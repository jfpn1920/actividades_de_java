package validacion_basica;
import java.util.Scanner;
public class leer_precio_y_aplicar_descuento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese el precio del producto: ");
        double precio = entrada.nextDouble();
        double descuento = 10;
        double precioFinal = precio - (precio * descuento / 100);
        System.out.println("el precio con descuento del " + descuento + "% es: " + precioFinal);
        entrada.close();
    }
}