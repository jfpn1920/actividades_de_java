package nivel_de_practica;
import java.util.Scanner;
public class sistema_bancario {
    static double saldo = 1000.0; 
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        mostrarMenu();
    }
    public static void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n sistema bancario ");
            System.out.println("1. consultar saldo");
            System.out.println("2. depositar dinero");
            System.out.println("3. retirar dinero");
            System.out.println("4. salir");
            System.out.print("seleccione una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    depositarDinero();
                    break;
                case 3:
                    retirarDinero();
                    break;
                case 4:
                    System.out.println("gracias por usar el sistema bancario.");
                    break;
                default:
                    System.out.println("opcion invalida.");
            }
        } while (opcion != 4);
    }
    public static void consultarSaldo() {
        System.out.println("su saldo actual es: $" + saldo);
    }
    public static void depositarDinero() {
        System.out.print("ingrese el monto a depositar: ");
        double deposito = scanner.nextDouble();
        saldo += deposito;
        System.out.println("deposito realizado con exito.");
    }
    public static void retirarDinero() {
        System.out.print("ingrese el monto a retirar: ");
        double retiro = scanner.nextDouble();
        if (retiro > saldo) {
            System.out.println("fondos insuficientes.");
        } else {
            saldo -= retiro;
            System.out.println("retiro realizado con exito.");
        }
    }
}