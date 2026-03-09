package introduccion_a_arraylist;
import java.util.ArrayList;
public class eliminar_con_remove {
    public static void main(String[] args) {
        ArrayList<String> paises = new ArrayList<>();
        paises.add("colombia");
        paises.add("mexico");
        paises.add("argentina");
        paises.remove(1);
        System.out.println("lista de paises: " + paises);
    }
}