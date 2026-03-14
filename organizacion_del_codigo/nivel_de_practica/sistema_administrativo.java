package nivel_de_practica;
import java.util.ArrayList;
import java.util.Scanner;
public class sistema_administrativo {
    static ArrayList<String> empleados = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        mostrarMenu();
    }
    public static void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n sistema administrativo ");
            System.out.println("1. registrar empleado");
            System.out.println("2. mostrar empleados");
            System.out.println("3. eliminar empleado");
            System.out.println("4. salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    registrarEmpleado();
                    break;
                case 2:
                    mostrarEmpleados();
                    break;
                case 3:
                    eliminarEmpleado();
                    break;
                case 4:
                    System.out.println("saliendo del sistema...");
                    break;
                default:
                    System.out.println("opcion invalida.");
            }
        } while (opcion != 4);
    }
    public static void registrarEmpleado() {
        System.out.print("ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        empleados.add(nombre);
        System.out.println("empleado registrado correctamente.");
    }
    public static void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("no hay empleados registrados.");
            return;
        }
        System.out.println("\n lista de empleados:");
        for (int i = 0; i < empleados.size(); i++) {
            System.out.println((i + 1) + ". " + empleados.get(i));
        }
    }
    public static void eliminarEmpleado() {
        if (empleados.isEmpty()) {
            System.out.println("no hay empleados para eliminar.");
            return;
        }
        mostrarEmpleados();
        System.out.print("ingrese el numero del empleado a eliminar: ");
        int indice = scanner.nextInt();
        if (indice > 0 && indice <= empleados.size()) {
            empleados.remove(indice - 1);
            System.out.println("empleado eliminado correctamente.");
        } else {
            System.out.println("numero invalido.");
        }
    }
}