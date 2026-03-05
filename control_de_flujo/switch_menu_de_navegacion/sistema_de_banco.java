package switch_menu_de_navegacion;
import java.util.Scanner;
public class sistema_de_banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.0;
        System.out.println("sistema bancario");
        System.out.println("1. consultar saldo");
        System.out.println("2. depositar dinero");
        System.out.println("3. retirar dinero");
        System.out.print("seleccione una opcion: ");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("su saldo actual es: $" + saldo);
                break;
            case 2:
                System.out.print("ingrese el monto a depositar: ");
                double deposito = scanner.nextDouble();
                saldo = saldo + deposito;
                System.out.println("deposito realizado, nuevo saldo: $" + saldo);
                break;
            case 3:
                System.out.print("ingrese el monto a retirar: ");
                double retiro = scanner.nextDouble();
                if (retiro <= saldo) {
                    saldo = saldo - retiro;
                    System.out.println("retiro realizado, nuevo saldo: $" + saldo);
                } else {
                    System.out.println("fondos insuficientes.");
                }
                break;
            default:
                System.out.println("opcion no valida.");
        }
        scanner.close();
    }
}