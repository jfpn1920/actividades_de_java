package problemas_tipo_mini_sistema;
import java.util.Scanner;
public class simulacion_de_cajero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese su saldo inicial: ");
        double saldo = entrada.nextDouble();
        System.out.println("\n opciones:");
        System.out.println("1. depositar dinero");
        System.out.println("2. retirar dinero");
        System.out.print("seleccione una opcion: ");
        int opcion = entrada.nextInt();
        if (opcion == 1) {
            System.out.print("ingrese la cantidad a depositar: ");
            double deposito = entrada.nextDouble();
            saldo += deposito;
            System.out.println("deposito realizado, saldo actual: " + saldo);
        } else if (opcion == 2) {
            System.out.print("ingrese la cantidad a retirar: ");
            double retiro = entrada.nextDouble();
            if (retiro <= saldo) {
                saldo -= retiro;
                System.out.println("retiro realizado, saldo actual: " + saldo);
            } else {
                System.out.println("fondos insuficientes, saldo actual: " + saldo);
            }
        } else {
            System.out.println("opcion no valida.");
        }
        entrada.close();
    }
}