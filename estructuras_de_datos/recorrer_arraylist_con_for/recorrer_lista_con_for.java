package recorrer_arraylist_con_for;
import java.util.ArrayList;
public class recorrer_lista_con_for {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("ana");
        nombres.add("luis");
        nombres.add("carlos");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }
    }
}