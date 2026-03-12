package mini_sistemas_con_metodos;
import java.util.Scanner;
public class sistema_de_notas {
    public static double ingresarNotas(Scanner scanner, int cantidad) {
        double suma = 0;
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("ingrese la nota " + i + ": ");
            double nota = scanner.nextDouble();
            suma += nota;
        }
        return suma;
    }
    public static double calcularPromedio(double suma, int cantidad) {
        return suma / cantidad;
    }
    public static void mostrarResultado(double promedio) {
        System.out.println("el promedio es: " + promedio);
        if (promedio >= 3.0) {
            System.out.println("estado: aprobado");
        } else {
            System.out.println("estado: reprobado");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadNotas = 3;
        double suma = ingresarNotas(scanner, cantidadNotas);
        double promedio = calcularPromedio(suma, cantidadNotas);
        mostrarResultado(promedio);
        scanner.close();
    }
}