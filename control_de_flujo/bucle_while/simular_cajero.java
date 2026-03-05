package bucle_while;
import java.util.Scanner;
public class simular_cajero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        double saldo = 1000.0; 
        while (opcion != 4) { 
            System.out.println("\n cajero automatico");
            System.out.println("1. consultar saldo");
            System.out.println("2. depositar");
            System.out.println("3. retirar");
            System.out.println("4. salir");
            System.out.print("seleccione una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("su saldo actual es: $" + saldo);
                    break;
                case 2:
                    System.out.print("ingrese el monto a depositar: ");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("deposito exitoso, nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("monto invalido.");
                    }
                    break;
                case 3:
                    System.out.print("ingrese el monto a retirar: ");
                    double retiro = scanner.nextDouble();
                    if (retiro > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("retiro exitoso, nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("monto invalido o saldo insuficiente.");
                    }
                    break;
                case 4:
                    System.out.println("gracias por usar el cajero, hasta luego");
                    break;
                default:
                    System.out.println("opcion invalida, intente de nuevo.");
            }
        }
        scanner.close();
    }
}