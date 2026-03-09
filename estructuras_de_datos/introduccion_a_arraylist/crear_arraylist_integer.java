package introduccion_a_arraylist;
import java.util.ArrayList;
public class crear_arraylist_integer {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        System.out.println("Lista de números: " + numeros);
    }
}