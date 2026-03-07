package casos_mas_reales;
import java.util.Scanner;
public class registro_de_calificaciones_multiples {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        double nota1, nota2, nota3, promedio;
        System.out.println("registro de calificaciones");
        System.out.print("ingrese el nombre del estudiante: ");
        nombre = entrada.nextLine();
        System.out.print("ingrese la primera calificacion: ");
        nota1 = entrada.nextDouble();
        System.out.print("ingrese la segunda calificacion: ");
        nota2 = entrada.nextDouble();
        System.out.print("ingrese la tercera calificacion: ");
        nota3 = entrada.nextDouble();
        promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("\n resutados");
        System.out.println("estudiante: " + nombre);
        System.out.println("nota 1: " + nota1);
        System.out.println("nota 2: " + nota2);
        System.out.println("nota 3: " + nota3);
        System.out.println("promedio: " + promedio);
        entrada.close();
    }
}