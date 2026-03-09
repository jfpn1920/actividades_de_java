package recorrer_arraylist_con_foreach;
import java.util.ArrayList;
public class contar_valores {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("manzana");
        frutas.add("banana");
        frutas.add("naranja");
        frutas.add("mango");
        int contador = 0;
        for (String fruta : frutas) {
            System.out.println(fruta);
            contador++;
        }
        System.out.println("la cantidad de elementos es: " + contador);
    }
}