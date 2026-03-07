package problemas_tipo_mini_sistema;
import java.util.Scanner;
public class registro_de_estudiantes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese el nombre del estudiante: ");
        String nombre = entrada.nextLine();
        System.out.print("ingrese la edad del estudiante: ");
        int edad = entrada.nextInt();
        System.out.print("ingrese la nota final del estudiante: ");
        double nota = entrada.nextDouble();
        System.out.println("\n registro del estudiante ");
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("nota final: " + nota);
        if (nota >= 3.0) {
            System.out.println("estado: aprobado");
        } else {
            System.out.println("estado: reprobado");
        }
        entrada.close();
    }
}