package uso_combinado_de_int_double_y_string;
import java.util.Scanner;
public class pedir_datos_de_un_estudiante_y_mostrar_ficha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese el nombre del estudiante: ");
        String nombre = entrada.nextLine();
        System.out.print("ingrese la edad del estudiante: ");
        int edad = entrada.nextInt();
        System.out.print("ingrese el promedio del estudiante: ");
        double promedio = entrada.nextDouble();
        System.out.println("\n ficha del estudiante");
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("promedio: " + promedio);
        entrada.close();
    }
}