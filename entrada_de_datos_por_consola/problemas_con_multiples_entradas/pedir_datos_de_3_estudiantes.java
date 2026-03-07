package problemas_con_multiples_entradas;
import java.util.Scanner;
public class pedir_datos_de_3_estudiantes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("\n estudiante " + i + " ");
            System.out.print("ingrese el nombre: ");
            String nombre = entrada.nextLine();
            System.out.print("ingrese la edad: ");
            int edad = entrada.nextInt();
            System.out.print("ingrese la nota promedio: ");
            double nota = entrada.nextDouble();
            entrada.nextLine(); // Limpiar buffer
            System.out.println("\n datos del estudiante " + i + ":");
            System.out.println("nombre: " + nombre);
            System.out.println("edad: " + edad);
            System.out.println("nota promedio: " + nota);
        }
        entrada.close();
    }
}