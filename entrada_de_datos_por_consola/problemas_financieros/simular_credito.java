package problemas_financieros;
import java.util.Scanner;
public class simular_credito {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese el monto del credito: ");
        double monto = entrada.nextDouble();
        System.out.print("ingrese la tasa de interes anual %: ");
        double tasa = entrada.nextDouble();
        System.out.print("ingrese el plazo en meses: ");
        int meses = entrada.nextInt();
        double interes = monto * (tasa / 100) * (meses / 12.0);
        double totalAPagar = monto + interes;
        double pagoMensual = totalAPagar / meses;
        System.out.println("\n simulacion de credito ");
        System.out.println("monto del credito: " + monto);
        System.out.println("interes total: " + interes);
        System.out.println("total a pagar: " + totalAPagar);
        System.out.println("pago mensual: " + pagoMensual);
        entrada.close();
    }
}