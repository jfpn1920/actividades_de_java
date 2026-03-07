package nivel_de_practica;
import java.util.Scanner;
public class mini_sistema_administrativo_por_consola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int totalEmpleados = 0;
        double salario;
        double totalSalarios = 0;
        do {
            System.out.println("\n mini sistema administrativo");
            System.out.println("1. registrar empleado");
            System.out.println("2. ver total de empleados");
            System.out.println("3. ver total de salarios");
            System.out.println("4. salir");
            System.out.print("seleccione una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("ingrese salario del empleado: ");
                    salario = scanner.nextDouble();
                    if (salario > 0) {
                        totalEmpleados++;
                        totalSalarios += salario;
                        System.out.println("empleado registrado correctamente.");
                    } else {
                        System.out.println("salario invalido.");
                    }
                    break;
                case 2:
                    System.out.println("total de empleados registrados: " + totalEmpleados);
                    break;
                case 3:
                    System.out.println("total de salarios a pagar: $" + totalSalarios);
                    break;
                case 4:
                    System.out.println("saliendo del sistema...");
                    break;
                default:
                    System.out.println("opcion invalida.");
            }
        } while (opcion != 4);
        scanner.close();
    }
}