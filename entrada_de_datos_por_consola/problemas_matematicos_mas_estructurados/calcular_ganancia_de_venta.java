package problemas_matematicos_mas_estructurados;
import java.util.Scanner;
public class calcular_ganancia_de_venta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precioVenta;
        double costo;
        double ganancia;
        System.out.print("ingrese el precio de venta: ");
        precioVenta = entrada.nextDouble();
        System.out.print("ingrese el costo del producto: ");
        costo = entrada.nextDouble();
        ganancia = precioVenta - costo;
        System.out.println("\nla ganancia de la venta es: " + ganancia);
        entrada.close();
    }
}