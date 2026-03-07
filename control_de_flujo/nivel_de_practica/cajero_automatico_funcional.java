package nivel_de_practica;
import java.util.Scanner;
public class cajero_automatico_funcional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000; 
        int opcion;
        do {
            System.out.println("\n cajero automatico");
            System.out.println("1. consultar saldo");
            System.out.println("2. depositar dinero");
            System.out.println("3. retirar dinero");
            System.out.println("4. salir");
            System.out.print("seleccione una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("su saldo actual es: $" + saldo);
                    break;
                case 2:
                    System.out.print("ingrese la cantidad a depositar: ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("deposito realizado, nuevo saldo: $" + saldo);
                    break;
                case 3:
                    System.out.print("ingrese la cantidad a retirar: ");
                    double retiro = scanner.nextDouble();
                    if (retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("retiro exitoso, nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("saldo insuficiente.");
                    }
                    break;
                case 4:
                    System.out.println("gracias por usar el cajero.");
                    break;
                default:
                    System.out.println("opcion invalida.");
            }
        } while (opcion != 4);
        scanner.close();
    }
}