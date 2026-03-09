package el_uso_del_arraylist_mas_poo;
import java.util.ArrayList;
import java.util.Scanner;
public class registrar_estudiantes_dinamicamente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        System.out.print("¿cuantos estudiantes desea registrar?: ");
        int cantidad = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n registro del estudiante " + (i + 1));
            System.out.print("nombre: ");
            String nombre = sc.nextLine();
            System.out.print("edad: ");
            int edad = sc.nextInt();
            System.out.print("nota: ");
            double nota = sc.nextDouble();
            sc.nextLine();
            estudiantes.add(new Estudiante(nombre, edad, nota));
        }
        System.out.println("\n lista de estudiantes registrados:");
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }
        sc.close();
    }
}
class Estudiante {
    String nombre;
    int edad;
    double nota;
    public Estudiante(String nombre, int edad, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }
    @Override
    public String toString() {
        return "nombre: " + nombre +
            " | edad: " + edad +
            " | nota: " + nota;
    }
}