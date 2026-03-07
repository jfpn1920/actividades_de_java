package nivel_de_practica;
import java.util.Scanner;
public class simulador_de_banco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        double saldoInicial;
        double deposito;
        double retiro;
        double saldoFinal;
        System.out.println("simulador de banco");
        System.out.print("ingrese el nombre del cliente: ");
        nombre = entrada.nextLine();
        System.out.print("ingrese el saldo inicial: ");
        saldoInicial = entrada.nextDouble();
        System.out.print("ingrese el monto a depositar: ");
        deposito = entrada.nextDouble();
        System.out.print("ingrese el monto a retirar: ");
        retiro = entrada.nextDouble();
        saldoFinal = saldoInicial + deposito - retiro;
        System.out.println("\n resumen de la cuenta ");
        System.out.println("cliente: " + nombre);
        System.out.println("saldo inicial: $" + saldoInicial);
        System.out.println("deposito: $" + deposito);
        System.out.println("retiro: $" + retiro);
        System.out.println("saldo final: $" + saldoFinal);
        entrada.close();
    }
}