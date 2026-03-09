package introduccion_a_arraylist;
import java.util.ArrayList;
public class agregar_elementos_add {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("manzana");
        frutas.add("banana");
        frutas.add("naranja");
        System.out.println("lista de frutas: " + frutas);
    }
}