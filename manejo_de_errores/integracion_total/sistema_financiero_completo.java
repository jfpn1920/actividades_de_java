package integracion_total;
import java.util.Scanner;
public class sistema_financiero_completo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double saldo = 2000;
        int opcion;
        do {
            System.out.println("\n sistema financiero ");
            System.out.println("1. consultar saldo");
            System.out.println("2. depositar dinero");
            System.out.println("3. retirar dinero");
            System.out.println("4. transferir dinero");
            System.out.println("5. salir");
            System.out.print("seleccione una opcion: ");
            try {
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("su saldo actual es: $" + saldo);
                        break;
                    case 2:
                        System.out.print("ingrese el monto a depositar: ");
                        double deposito = entrada.nextDouble();
                        if (deposito <= 0) {
                            System.out.println("error: el monto debe ser mayor que 0.");
                        } else {
                            saldo += deposito;
                            System.out.println("deposito realizado correctamente.");
                        }
                        break;
                    case 3:
                        System.out.print("ingrese el monto a retirar: ");
                        double retiro = entrada.nextDouble();
                        if (retiro <= 0) {
                            System.out.println("error: el monto debe ser mayor que 0.");
                        } 
                        else if (retiro > saldo) {
                            System.out.println("error: no tiene saldo suficiente.");
                        } 
                        else {
                            saldo -= retiro;
                            System.out.println("retiro realizado correctamente.");
                        }
                        break;
                    case 4:
                        System.out.print("ingrese el monto a transferir: ");
                        double transferencia = entrada.nextDouble();
                        if (transferencia <= 0) {
                            System.out.println("error: el monto debe ser mayor que 0.");
                        } 
                        else if (transferencia > saldo) {
                            System.out.println("error: saldo insuficiente.");
                        } 
                        else {
                            saldo -= transferencia;
                            System.out.println("transferencia realizada correctamente.");
                        }
                        break;
                    case 5:
                        System.out.println("saliendo del sistema financiero...");
                        break;
                    default:
                        System.out.println("opcion invalida.");
                }
            } catch (Exception e) {
                System.out.println("error: debe ingresar un numero valido.");
                entrada.nextLine();
                opcion = 0;
            }
        } while (opcion != 5);
        entrada.close();
    }
}