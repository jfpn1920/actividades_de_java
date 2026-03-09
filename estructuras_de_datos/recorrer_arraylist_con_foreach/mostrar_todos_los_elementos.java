package recorrer_arraylist_con_foreach;
import java.util.ArrayList;
public class mostrar_todos_los_elementos {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("ana");
        nombres.add("luis");
        nombres.add("carlos");
        nombres.add("maria");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}