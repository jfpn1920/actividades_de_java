package nivel_de_practica;
import java.util.Scanner;
public class registro_de_estudiantes_con_promedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        double nota1, nota2, nota3, promedio;
        char continuar;
        do {
            System.out.print("ingrese el nombre del estudiante: ");
            nombre = scanner.nextLine();
            System.out.print("ingrese la primera nota: ");
            nota1 = scanner.nextDouble();
            System.out.print("ingrese la segunda nota: ");
            nota2 = scanner.nextDouble();
            System.out.print("ingrese la tercera nota: ");
            nota3 = scanner.nextDouble();
            promedio = (nota1 + nota2 + nota3) / 3;
            System.out.println("promedio de " + nombre + ": " + promedio);
            if (promedio >= 3) {
                System.out.println("estado: aprobado");
            } else {
                System.out.println("estado: reprobado");
            }
            scanner.nextLine(); 
            System.out.print("¿desea registrar otro estudiante? (s/n): ");
            continuar = scanner.nextLine().charAt(0);
        } while (continuar == 's' || continuar == 'S');
        scanner.close();
    }
}