package problemas_tipo_mini_sistema;
import java.util.Scanner;
public class sistema_de_notas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese el nombre del estudiante: ");
        String nombre = entrada.nextLine();
        System.out.print("ingrese la primera nota: ");
        double nota1 = entrada.nextDouble();
        System.out.print("ingrese la segunda nota: ");
        double nota2 = entrada.nextDouble();
        System.out.print("ingrese la tercera nota: ");
        double nota3 = entrada.nextDouble();
        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("\n sistema de notas ");
        System.out.println("estudiante: " + nombre);
        System.out.println("notas: " + nota1 + ", " + nota2 + ", " + nota3);
        System.out.println("promedio: " + promedio);
        if (promedio >= 3.0) {
            System.out.println("resultado: aprobado");
        } else {
            System.out.println("resultado: reprobado");
        }
        entrada.close();
    }
}