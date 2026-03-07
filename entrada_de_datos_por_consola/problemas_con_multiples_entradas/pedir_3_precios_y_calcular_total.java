package problemas_con_multiples_entradas;
import java.util.Scanner;
public class pedir_3_precios_y_calcular_total {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double total = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("ingrese el precio " + i + ": ");
            double precio = entrada.nextDouble();
            total += precio;
        }
        System.out.println("\n el total de los 3 precios es: " + total);
        entrada.close();
    }
}