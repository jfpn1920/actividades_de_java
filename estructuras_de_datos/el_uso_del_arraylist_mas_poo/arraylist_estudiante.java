package el_uso_del_arraylist_mas_poo;
import java.util.ArrayList;
public class arraylist_estudiante {
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("juan", 20, 4.5));
        estudiantes.add(new Estudiante("maria", 21, 4.8));
        estudiantes.add(new Estudiante("pedro", 19, 4.2));
        System.out.println("lista de estudiantes:");
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }
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