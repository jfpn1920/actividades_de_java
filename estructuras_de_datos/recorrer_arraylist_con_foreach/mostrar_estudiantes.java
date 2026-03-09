package recorrer_arraylist_con_foreach;
import java.util.ArrayList;
public class mostrar_estudiantes {
    public static void main(String[] args) {
        ArrayList<String> estudiantes = new ArrayList<>();
        estudiantes.add("juan");
        estudiantes.add("maria");
        estudiantes.add("carlos");
        estudiantes.add("ana");
        estudiantes.add("luis");
        System.out.println("lista de estudiantes:");
        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }
}