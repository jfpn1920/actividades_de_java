package problemas_financieros;
import java.util.Scanner;
public class simular_ahorro_mensual {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese el monto a ahorrar por mes: ");
        double ahorroMensual = entrada.nextDouble();
        System.out.print("ingrese el numero de meses: ");
        int meses = entrada.nextInt();
        double totalAhorro = ahorroMensual * meses;
        System.out.println("\n simulacion de ahorro mensual ");
        System.out.println("monto a ahorrar por mes: " + ahorroMensual);
        System.out.println("numero de meses: " + meses);
        System.out.println("total acumulado: " + totalAhorro);
        entrada.close();
    }
}