package recorrer_arraylist_con_for;
import java.util.ArrayList;
public class mostrar_lista_inversa {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("ana");
        nombres.add("luis");
        nombres.add("carlos");
        nombres.add("maria");
        for (int i = nombres.size() - 1; i >= 0; i--) {
            System.out.println(nombres.get(i));
        }
    }
}