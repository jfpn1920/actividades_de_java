package introduccion_a_arraylist;
import java.util.ArrayList;
public class limpiar_lista_clear {
    public static void main(String[] args) {
        ArrayList<String> materias = new ArrayList<>();
        materias.add("matematicas");
        materias.add("programación");
        materias.add("inglés");
        System.out.println("lista antes de limpiar: " + materias);
        materias.clear();
        System.out.println("lista despues de limpiar: " + materias);
    }
}