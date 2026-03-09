package el_uso_del_arraylist_mas_poo;
import java.util.ArrayList;
import java.util.Scanner;
public class buscar_estudiante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("juan", 4.5));
        estudiantes.add(new Estudiante("maria", 4.8));
        estudiantes.add(new Estudiante("pedro", 3.9));
        System.out.print("ingrese el nombre del estudiante a buscar: ");
        String nombreBuscar = sc.nextLine();
        boolean encontrado = false;
        for (Estudiante e : estudiantes) {
            if (e.nombre.equalsIgnoreCase(nombreBuscar)) {
                System.out.println("\n estudiante encontrado:");
                System.out.println(e);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("\n el estudiante no fue encontrado.");
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