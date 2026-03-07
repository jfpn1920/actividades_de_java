package nivel_de_practica;
import java.util.Scanner;
public class mini_sistema_administrativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombreEmpleado;
        String cargo;
        double salarioBase;
        double bono;
        double descuento;
        double salarioFinal;
        System.out.println("mini sistema administrativo");
        System.out.print("ingrese el nombre del empleado: ");
        nombreEmpleado = entrada.nextLine();
        System.out.print("ingrese el cargo del empleado: ");
        cargo = entrada.nextLine();
        System.out.print("ingrese el salario base: ");
        salarioBase = entrada.nextDouble();
        System.out.print("ingrese el bono adicional: ");
        bono = entrada.nextDouble();
        System.out.print("ingrese el descuento aplicado: ");
        descuento = entrada.nextDouble();
        salarioFinal = salarioBase + bono - descuento;
        System.out.println("\nresumen del empleado");
        System.out.println("empleado: " + nombreEmpleado);
        System.out.println("cargo: " + cargo);
        System.out.println("salario base: $" + salarioBase);
        System.out.println("bono: $" + bono);
        System.out.println("descuento: $" + descuento);
        System.out.println("salario final: $" + salarioFinal);
        entrada.close();
    }
}