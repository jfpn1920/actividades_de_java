package problemas_financieros;
import java.util.Scanner;
public class calcular_interes_compuesto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese el monto principal: ");
        double principal = entrada.nextDouble();
        System.out.print("ingrese la tasa de interes % por periodo: ");
        double tasa = entrada.nextDouble();
        System.out.print("ingrese el numero de periodos: ");
        int periodos = entrada.nextInt();
        double montoFinal = principal * Math.pow(1 + tasa / 100, periodos);
        System.out.println("\n resultado del interes compuesto ");
        System.out.println("monto inicial: " + principal);
        System.out.println("monto final despues de " + periodos + " periodos: " + montoFinal);
        entrada.close();
    }
}