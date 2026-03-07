package problemas_financieros;
import java.util.Scanner;
public class calcular_cuotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese el monto total a pagar: ");
        double total = entrada.nextDouble();
        System.out.print("ingrese el numero de cuotas: ");
        int cuotas = entrada.nextInt();
        System.out.print("ingrese la tasa de interes por cuota %: ");
        double tasa = entrada.nextDouble();
        double interesTotal = total * (tasa / 100);
        double totalConInteres = total + interesTotal;
        double valorCuota = totalConInteres / cuotas;
        System.out.println("\n resultado de cuotas ");
        System.out.println("monto total: " + total);
        System.out.println("interes total: " + interesTotal);
        System.out.println("total a pagar con interes: " + totalConInteres);
        System.out.println("valor de cada cuota: " + valorCuota);
        entrada.close();
    }
}