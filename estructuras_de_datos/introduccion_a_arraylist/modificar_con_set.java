package introduccion_a_arraylist;
import java.util.ArrayList;
public class modificar_con_set {
    public static void main(String[] args) {
        ArrayList<String> animales = new ArrayList<>();
        animales.add("perro");
        animales.add("gato");
        animales.add("conejo");
        animales.set(1, "tigre");
        System.out.println("lista de animales: " + animales);
    }
}