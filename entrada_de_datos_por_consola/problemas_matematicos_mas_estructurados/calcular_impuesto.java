package problemas_matematicos_mas_estructurados;
import java.util.Scanner;
public class calcular_impuesto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double monto;
        double porcentaje;
        double impuesto;
        System.out.print("ingrese el monto: ");
        monto = entrada.nextDouble();
        System.out.print("ingrese el porcentaje de impuesto: ");
        porcentaje = entrada.nextDouble();
        impuesto = monto * (porcentaje / 100);
        System.out.println("\nel impuesto es: " + impuesto);
        entrada.close();
    }
}