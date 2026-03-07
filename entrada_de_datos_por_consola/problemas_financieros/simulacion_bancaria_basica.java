package problemas_financieros;
import java.util.Scanner;
public class simulacion_bancaria_basica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese el nombre del cliente: ");
        String nombre = entrada.nextLine();
        System.out.print("ingrese el saldo inicial: ");
        double saldo = entrada.nextDouble();
        System.out.print("ingrese monto a depositar: ");
        double deposito = entrada.nextDouble();
        System.out.print("ingrese monto a retirar: ");
        double retiro = entrada.nextDouble();
        saldo = saldo + deposito - retiro;
        System.out.println("\n simulacion bancaria ");
        System.out.println("cliente: " + nombre);
        System.out.println("saldo inicial: " + (saldo - deposito + retiro));
        System.out.println("deposito realizado: " + deposito);
        System.out.println("retiro realizado: " + retiro);
        System.out.println("saldo final: " + saldo);
        entrada.close();
    }
}