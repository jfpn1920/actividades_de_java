package nivel_de_practica;
import java.util.Scanner;
public class simulacion_de_matricula_universitaria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String carrera;
        int numeroMaterias;
        double costoMateria;
        double totalMatricula;
        System.out.println("simulacion de matricula universitaria");
        System.out.print("ingrese el nombre del estudiante: ");
        nombre = entrada.nextLine();
        System.out.print("ingrese la carrera: ");
        carrera = entrada.nextLine();
        System.out.print("ingrese el numero de materias a matricular: ");
        numeroMaterias = entrada.nextInt();
        System.out.print("ingrese el costo por materia: ");
        costoMateria = entrada.nextDouble();
        totalMatricula = numeroMaterias * costoMateria;
        System.out.println("\n resumen de matricula ");
        System.out.println("estudiante: " + nombre);
        System.out.println("carrera: " + carrera);
        System.out.println("materias inscritas: " + numeroMaterias);
        System.out.println("costo por materia: $" + costoMateria);
        System.out.println("total de la matricula: $" + totalMatricula);
        entrada.close();
    }
}