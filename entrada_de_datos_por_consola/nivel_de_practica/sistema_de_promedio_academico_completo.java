package nivel_de_practica;
import java.util.Scanner;
public class sistema_de_promedio_academico_completo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        double nota1, nota2, nota3, nota4;
        double promedio;
        System.out.println("sistema de promedio academico");
        System.out.print("ingrese el nombre del estudiante: ");
        nombre = entrada.nextLine();
        System.out.print("ingrese la primera calificacion: ");
        nota1 = entrada.nextDouble();
        System.out.print("ingrese la segunda calificacion: ");
        nota2 = entrada.nextDouble();
        System.out.print("ingrese la tercera calificacion: ");
        nota3 = entrada.nextDouble();
        System.out.print("ingrese la cuarta calificacion: ");
        nota4 = entrada.nextDouble();
        promedio = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("\n resultado academico ");
        System.out.println("estudiante: " + nombre);
        System.out.println("promedio: " + promedio);
        if (promedio >= 3.0) {
            System.out.println("estado: aprobado");
        } else {
            System.out.println("estado: reprobado");
        }
        entrada.close();
    }
}