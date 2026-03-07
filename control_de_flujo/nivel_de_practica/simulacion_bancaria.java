package nivel_de_practica;
import java.util.Scanner;
public class simulacion_bancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000;
        int opcion;
        double monto;
        do {
            System.out.println("\nsimulacion bancaria");
            System.out.println("1. consultar saldo");
            System.out.println("2. depositar dinero");
            System.out.println("3. retirar dinero");
            System.out.println("4. transferir dinero");
            System.out.println("5. salir");
            System.out.print("seleccione una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("saldo actual: $" + saldo);
                    break;
                case 2:
                    System.out.print("ingrese monto a depositar: ");
                    monto = scanner.nextDouble();
                    saldo += monto;
                    System.out.println("deposito exitoso, nuevo saldo: $" + saldo);
                    break;
                case 3:
                    System.out.print("ingrese monto a retirar: ");
                    monto = scanner.nextDouble();
                    if (monto <= saldo) {
                        saldo -= monto;
                        System.out.println("retiro exitoso, nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("saldo insuficiente.");
                    }
                    break;
                case 4:
                    System.out.print("ingrese monto a transferir: ");
                    monto = scanner.nextDouble();
                    if (monto <= saldo) {
                        saldo -= monto;
                        System.out.println("transferencia realizada, nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("saldo insuficiente para transferir.");
                    }
                    break;
                case 5:
                    System.out.println("gracias por usar el sistema bancario.");
                    break;
                default:
                    System.out.println("opcion invalida.");
            }
        } while (opcion != 5);
        scanner.close();
    }
}