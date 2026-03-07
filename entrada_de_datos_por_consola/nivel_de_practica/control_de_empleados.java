package nivel_de_practica;
import java.util.Scanner;
public class control_de_empleados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String cargo;
        int horasTrabajadas;
        double pagoPorHora;
        double salarioTotal;
        System.out.println("control de empleados");
        System.out.print("ingrese el nombre del empleado: ");
        nombre = entrada.nextLine();
        System.out.print("ingrese el cargo del empleado: ");
        cargo = entrada.nextLine();
        System.out.print("ingrese las horas trabajadas: ");
        horasTrabajadas = entrada.nextInt();
        System.out.print("ingrese el pago por hora: ");
        pagoPorHora = entrada.nextDouble();
        salarioTotal = horasTrabajadas * pagoPorHora;
        System.out.println("\n informacion del empleado ");
        System.out.println("nombre: " + nombre);
        System.out.println("cargo: " + cargo);
        System.out.println("horas trabajadas: " + horasTrabajadas);
        System.out.println("pago por hora: $" + pagoPorHora);
        System.out.println("salario total: $" + salarioTotal);
        entrada.close();
    }
}