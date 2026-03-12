package mini_sistemas_con_metodos;
import java.util.Scanner;
public class sistema_administrativo {
    public static void mostrarMenu() {
        System.out.println("\n sistema administrativo ");
        System.out.println("1. registrar empleado");
        System.out.println("2. ver empleados");
        System.out.println("3. salir");
        System.out.print("seleccione una opcion: ");
    }
    public static void registrarEmpleado(String[] empleados, Scanner scanner, int indice) {
        System.out.print("ingrese el nombre del empleado: ");
        empleados[indice] = scanner.nextLine();
        System.out.println("empleado registrado correctamente.");
    }
    public static void mostrarEmpleados(String[] empleados) {
        System.out.println("\n lista de empleados:");
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] != null) {
                System.out.println((i + 1) + ". " + empleados[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] empleados = new String[5];
        int contador = 0;
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcion) {
                case 1:
                    if (contador < empleados.length) {
                        registrarEmpleado(empleados, scanner, contador);
                        contador++;
                    } else {
                        System.out.println("no se pueden registrar mas empleados.");
                    }
                    break;
                case 2:
                    mostrarEmpleados(empleados);
                    break;
                case 3:
                    System.out.println("saliendo del sistema...");
                    break;
                default:
                    System.out.println("opcion invalida.");
            }
        } while (opcion != 3);
        scanner.close();
    }
}