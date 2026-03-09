package introduccion_a_arraylist;
import java.util.ArrayList;
public class verificar_si_esta_vacio {
    public static void main(String[] args) {
        ArrayList<String> tareas = new ArrayList<>();
        if (tareas.isEmpty()) {
            System.out.println("la lista esta vacia");
        } else {
            System.out.println("la lista tiene elementos");
        }
    }
}