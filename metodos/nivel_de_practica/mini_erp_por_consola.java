package nivel_de_practica;
import java.util.Scanner;
public class mini_erp_por_consola {
    public static void mostrarMenu() {
        System.out.println("\n mini erp empresarial ");
        System.out.println("1. registrar empleado");
        System.out.println("2. registrar producto");
        System.out.println("3. ver empleados");
        System.out.println("4. ver productos");
        System.out.println("5. salir");
        System.out.print("seleccione una opcion: ");
    }
    public static void registrarEmpleado(String[] empleados, Scanner scanner, int indice) {
        System.out.print("ingrese el nombre del empleado: ");
        empleados[indice] = scanner.nextLine();
        System.out.println("empleado registrado correctamente.");
    }
    public static void registrarProducto(String[] productos, Scanner scanner, int indice) {
        System.out.print("ingrese el nombre del producto: ");
        productos[indice] = scanner.nextLine();
        System.out.println("producto registrado correctamente.");
    }
    public static void mostrarEmpleados(String[] empleados) {
        System.out.println("\n lista de empleados ");
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] != null) {
                System.out.println((i + 1) + ". " + empleados[i]);
            }
        }
    }
    public static void mostrarProductos(String[] productos) {
        System.out.println("\n lista de productos ");
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null) {
                System.out.println((i + 1) + ". " + productos[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] empleados = new String[5];
        String[] productos = new String[5];
        int contadorEmpleados = 0;
        int contadorProductos = 0;
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcion) {
                case 1:
                    if (contadorEmpleados < empleados.length) {
                        registrarEmpleado(empleados, scanner, contadorEmpleados);
                        contadorEmpleados++;
                    } else {
                        System.out.println("no se pueden registrar mas empleados.");
                    }
                    break;
                case 2:
                    if (contadorProductos < productos.length) {
                        registrarProducto(productos, scanner, contadorProductos);
                        contadorProductos++;
                    } else {
                        System.out.println("no se pueden registrar mas productos.");
                    }
                    break;
                case 3:
                    mostrarEmpleados(empleados);
                    break;
                case 4:
                    mostrarProductos(productos);
                    break;
                case 5:
                    System.out.println("saliendo del mini erp...");
                    break;
                default:
                    System.out.println("opcion invalida.");
            }
        } while (opcion != 5);
        scanner.close();
    }
}