package integracion_total;
import java.util.Scanner;
public class sistema_bancario_con_manejo_de_errores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double saldo = 1000; 
        int opcion;
        do {
            System.out.println("\n sistema bancario");
            System.out.println("1. consultar saldo");
            System.out.println("2. depositar dinero");
            System.out.println("3. retirar dinero");
            System.out.println("4. salir");
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
                            System.out.println("deposito realizado con exito.");
                        }
                        break;
                    case 3:
                        System.out.print("ingrese el monto a retirar: ");
                        double retiro = entrada.nextDouble();
                        if (retiro <= 0) {
                            System.out.println("error: el monto debe ser mayor que 0.");
                        } 
                        else if (retiro > saldo) {
                            System.out.println("error: no tiene suficiente saldo.");
                        } 
                        else {
                            saldo -= retiro;
                            System.out.println("retiro realizado con exito.");
                        }
                        break;
                    case 4:
                        System.out.println("gracias por usar el sistema bancario.");
                        break;
                    default:
                        System.out.println("opcion invalida.");
                }
            } catch (Exception e) {
                System.out.println("error: debe ingresar un numero valido.");
                entrada.nextLine(); 
                opcion = 0;
            }
        } while (opcion != 4);
        entrada.close();
    }
}