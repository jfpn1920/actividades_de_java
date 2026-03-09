package el_uso_del_arraylist_mas_poo;
import java.util.ArrayList;
import java.util.Scanner;
public class mini_sistema_administrativo_completo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();
        int opcion;
        do {
            System.out.println("\n mini sistema administrativo ");
            System.out.println("1. registrar empleado");
            System.out.println("2. buscar empleado");
            System.out.println("3. modificar empleado");
            System.out.println("4. eliminar empleado");
            System.out.println("5. mostrar todos los empleados");
            System.out.println("6. salir");
            System.out.print("seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("cargo: ");
                    String cargo = sc.nextLine();
                    System.out.print("salario: ");
                    double salario = sc.nextDouble();
                    sc.nextLine();
                    empleados.add(new Empleado(nombre, cargo, salario));
                    System.out.println("empleado registrado correctamente.");
                    break;
                case 2:
                    System.out.print("ingrese el nombre a buscar: ");
                    String buscar = sc.nextLine();
                    boolean encontrado = false;
                    for (Empleado e : empleados) {
                        if (e.nombre.equalsIgnoreCase(buscar)) {
                            System.out.println(e);
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("empleado no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("nombre del empleado a modificar: ");
                    String modificar = sc.nextLine();
                    for (Empleado e : empleados) {
                        if (e.nombre.equalsIgnoreCase(modificar)) {
                            System.out.print("nuevo cargo: ");
                            e.cargo = sc.nextLine();
                            System.out.print("nuevo salario: ");
                            e.salario = sc.nextDouble();
                            sc.nextLine();
                            System.out.println("empleado modificado.");
                        }
                    }
                    break;
                case 4:
                    System.out.print("nombre del empleado a eliminar: ");
                    String eliminar = sc.nextLine();
                    empleados.removeIf(e -> e.nombre.equalsIgnoreCase(eliminar));
                    System.out.println("empleado eliminado si existia.");
                    break;
                case 5:
                    System.out.println("\n lista de empleados");
                    for (Empleado e : empleados) {
                        System.out.println(e);
                    }
                    break;
                case 6:
                    System.out.println("saliendo del sistema...");
                    break;
                default:
                    System.out.println("opcion invalida.");
            }
        } while (opcion != 6);
        sc.close();
    }
}
class Empleado {
    String nombre;
    String cargo;
    double salario;
    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }
    @Override
    public String toString() {
        return "nombre: " + nombre + " | cargo: " + cargo + " | salario: $" + salario;
    }
}