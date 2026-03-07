package uso_combinado_de_int_double_y_string;
import java.util.Scanner;
public class pedir_datos_de_un_empleado_y_mostrar_resumen {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese el nombre del empleado: ");
        String nombre = entrada.nextLine();
        System.out.print("ingrese la edad del empleado: ");
        int edad = entrada.nextInt();
        System.out.print("ingrese el salario del empleado: ");
        double salario = entrada.nextDouble();
        System.out.println("\n resumen del empleado");
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("salario: " + salario);
        entrada.close();
    }
}