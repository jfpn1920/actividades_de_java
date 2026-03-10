package nivel_practica;
import java.util.Scanner;
public class sistema_modular_con_multiples_clases {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        GestorEstudiantes gestor = new GestorEstudiantes();
        int opcion;
        do {
            System.out.println("\n sistema modular ");
            System.out.println("1. agregar estudiante");
            System.out.println("2. mostrar estudiantes");
            System.out.println("3. salir");
            System.out.print("seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("ingrese el nombre del estudiante: ");
                    String nombre = entrada.nextLine();
                    System.out.print("ingrese la nota: ");
                    double nota = entrada.nextDouble();
                    gestor.agregarEstudiante(nombre, nota);
                    break;
                case 2:
                    gestor.mostrarEstudiantes();
                    break;
                case 3:
                    System.out.println("saliendo del sistema...");
                    break;
                default:
                    System.out.println("opcion invalida.");
            }
        } while (opcion != 3);
        entrada.close();
    }
}
class Estudiante {
    String nombre;
    double nota;
    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
}
class GestorEstudiantes {
    Estudiante[] lista = new Estudiante[5];
    int contador = 0;
    public void agregarEstudiante(String nombre, double nota) {
        if (contador < lista.length) {
            lista[contador] = new Estudiante(nombre, nota);
            contador++;
            System.out.println("estudiante agregado correctamente.");
        } else {
            System.out.println("no se pueden agregar mas estudiantes.");
        }
    }
    public void mostrarEstudiantes() {
        if (contador == 0) {
            System.out.println("no hay estudiantes registrados.");
            return;
        }
        System.out.println("\n lista de estudiantes:");
        for (int i = 0; i < contador; i++) {
            System.out.println((i + 1) + ". " + lista[i].nombre +
                    " - nota: " + lista[i].nota);
        }
    }
}