package recorrer_arraylist_con_foreach;
import java.util.ArrayList;
public class mostrar_nombres_largos {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("ana");
        nombres.add("carlos");
        nombres.add("luis");
        nombres.add("alejandro");
        nombres.add("maria");
        for (String nombre : nombres) {
            if (nombre.length() > 5) {
                System.out.println(nombre);
            }
        }
    }
}