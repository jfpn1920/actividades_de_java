package mini_sistemas_con_metodos;
import java.util.Scanner;
public class sistema_bancario_simple {
    public static void mostrarMenu() {
        System.out.println("\n sistema bancario ");
        System.out.println("1. consultar saldo");
        System.out.println("2. depositar dinero");
        System.out.println("3. retirar dinero");
        System.out.println("4. salir");
        System.out.print("seleccione una opcion: ");
    }
    public static void consultarSaldo(double saldo) {
        System.out.println("su saldo actual es: $" + saldo);
    }
    public static double depositar(double saldo, double cantidad) {
        saldo += cantidad;
        System.out.println("deposito realizado correctamente.");
        return saldo;
    }
    public static double retirar(double saldo, double cantidad) {
        if (cantidad > saldo) {
            System.out.println("fondos insuficientes.");
        } else {
            saldo -= cantidad;
            System.out.println("retiro realizado correctamente.");
        }
        return saldo;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000;
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    consultarSaldo(saldo);
                    break;
                case 2:
                    System.out.print("ingrese la cantidad a depositar: ");
                    double deposito = scanner.nextDouble();
                    saldo = depositar(saldo, deposito);
                    break;
                case 3:
                    System.out.print("ingrese la cantidad a retirar: ");
                    double retiro = scanner.nextDouble();
                    saldo = retirar(saldo, retiro);
                    break;
                case 4:
                    System.out.println("gracias por usar el sistema bancario.");
                    break;
                default:
                    System.out.println("opcion invalida.");
            }
        } while (opcion != 4);
        scanner.close();
    }
}