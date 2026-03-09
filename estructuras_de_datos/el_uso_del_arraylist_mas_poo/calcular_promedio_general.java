package el_uso_del_arraylist_mas_poo;
import java.util.ArrayList;
public class calcular_promedio_general {
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("juan", 4.5));
        estudiantes.add(new Estudiante("maria", 4.8));
        estudiantes.add(new Estudiante("pedro", 3.9));
        double sumaNotas = 0;
        for (Estudiante e : estudiantes) {
            sumaNotas += e.nota;
        }
        double promedio = sumaNotas / estudiantes.size();
        System.out.println("promedio general de los estudiantes: " + promedio);
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