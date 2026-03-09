package el_uso_del_arraylist_mas_poo;
import java.util.ArrayList;
public class mostrar_todos_los_registros {
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("juan", 4.5));
        estudiantes.add(new Estudiante("maria", 4.8));
        estudiantes.add(new Estudiante("pedro", 3.9));
        estudiantes.add(new Estudiante("ana", 4.7));
        System.out.println("lista de estudiantes registrados");
        System.out.println("--------------------------------");
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }
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