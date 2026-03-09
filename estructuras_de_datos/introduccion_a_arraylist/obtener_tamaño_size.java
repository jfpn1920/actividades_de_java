package introduccion_a_arraylist;
import java.util.ArrayList;
public class obtener_tamaño_size {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("ana");
        nombres.add("luis");
        nombres.add("pedro");
        int tamaño = nombres.size();
        System.out.println("el tamaño de la lista es: " + tamaño);
    }
}