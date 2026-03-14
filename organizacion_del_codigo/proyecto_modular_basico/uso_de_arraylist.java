package proyecto_modular_basico;
import java.util.ArrayList;
public class uso_de_arraylist {
    public static void main(String[] args) {
        ArrayList<String> estudiantes = new ArrayList<>();
        agregarEstudiantes(estudiantes);
        mostrarEstudiantes(estudiantes);
        eliminarEstudiante(estudiantes, "ana");
        System.out.println("\n despues de eliminar a ana:");
        mostrarEstudiantes(estudiantes);
    }
    public static void agregarEstudiantes(ArrayList<String> lista) {
        lista.add("juan");
        lista.add("ana");
        lista.add("carlos");
    }
    public static void mostrarEstudiantes(ArrayList<String> lista) {
        System.out.println("estudiantes en la lista:");
        for (String estudiante : lista) {
            System.out.println("- " + estudiante);
        }
    }
    public static void eliminarEstudiante(ArrayList<String> lista, String nombre) {
        lista.remove(nombre);
    }
}