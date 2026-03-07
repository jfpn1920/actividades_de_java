package problemas_tipo_mini_sistema;
import java.util.Scanner;
public class registro_de_empleados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese el nombre del empleado: ");
        String nombre = entrada.nextLine();
        System.out.print("ingrese la edad del empleado: ");
        int edad = entrada.nextInt();
        entrada.nextLine(); 
        System.out.print("ingrese el cargo del empleado: ");
        String cargo = entrada.nextLine();
        System.out.print("ingrese el salario del empleado: ");
        double salario = entrada.nextDouble();
        System.out.println("\n registro del empleado ");
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("cargo: " + cargo);
        System.out.println("salario: " + salario);
        entrada.close();
    }
}