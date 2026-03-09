package el_uso_del_arraylist_mas_poo;
import java.util.ArrayList;
import java.util.Scanner;
public class eliminar_estudiante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("juan", 4.5));
        estudiantes.add(new Estudiante("maria", 4.8));
        estudiantes.add(new Estudiante("pedro", 3.9));
        System.out.print("ingrese el nombre del estudiante a eliminar: ");
        String nombreEliminar = sc.nextLine();
        boolean eliminado = false;
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).nombre.equalsIgnoreCase(nombreEliminar)) {
                estudiantes.remove(i);
                eliminado = true;
                break;
            }
        }
        if (eliminado) {
            System.out.println("\n estudiante eliminado correctamente.");
        } else {
            System.out.println("\n el estudiante no fue encontrado.");
        }
        System.out.println("\n lista actual de estudiantes:");
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }
        sc.close();
    }
}
class Estudiante {
    String nombre;
    double nota;
    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    @Override
    public String toString() {
        return "nombre: " + nombre + " | nota: " + nota;
    }
}