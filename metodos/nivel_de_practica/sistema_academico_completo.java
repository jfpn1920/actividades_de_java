package nivel_de_practica;
import java.util.Scanner;
public class sistema_academico_completo {
    public static void mostrarMenu() {
        System.out.println("\n sistema academico ");
        System.out.println("1. registrar estudiante");
        System.out.println("2. registrar nota");
        System.out.println("3. mostrar estudiantes y notas");
        System.out.println("4. calcular promedio");
        System.out.println("5. salir");
        System.out.print("seleccione una opcion: ");
    }
    public static void registrarEstudiante(String[] estudiantes, Scanner scanner, int indice) {
        System.out.print("ingrese el nombre del estudiante: ");
        estudiantes[indice] = scanner.nextLine();
        System.out.println("estudiante registrado correctamente.");
    }
    public static void registrarNota(double[] notas, Scanner scanner, int indice) {
        System.out.print("ingrese la nota del estudiante: ");
        notas[indice] = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("nota registrada correctamente.");
    }
    public static void mostrarDatos(String[] estudiantes, double[] notas) {
        System.out.println("\n lista de estudiantes ");
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] != null) {
                System.out.println("estudiante: " + estudiantes[i] + " | nota: " + notas[i]);
            }
        }
    }
    public static double calcularPromedio(double[] notas, int cantidad) {
        if (cantidad == 0) {
            return 0;
        }
        double suma = 0;
        for (int i = 0; i < cantidad; i++) {
            suma += notas[i];
        }
        return suma / cantidad;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] estudiantes = new String[5];
        double[] notas = new double[5];
        int contador = 0;
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    if (contador < estudiantes.length) {
                        registrarEstudiante(estudiantes, scanner, contador);
                    } else {
                        System.out.println("no se pueden registrar mas estudiantes.");
                    }
                    break;
                case 2:
                    if (contador < estudiantes.length) {
                        registrarNota(notas, scanner, contador);
                        contador++;
                    } else {
                        System.out.println("primero registre estudiantes.");
                    }
                    break;
                case 3:
                    mostrarDatos(estudiantes, notas);
                    break;
                case 4:
                    double promedio = calcularPromedio(notas, contador);
                    System.out.println("el promedio del curso es: " + promedio);
                    break;
                case 5:
                    System.out.println("saliendo del sistema academico...");
                    break;
                default:
                    System.out.println("opcion invalida.");
            }
        } while (opcion != 5);
        scanner.close();
    }
}