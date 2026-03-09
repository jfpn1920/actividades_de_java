package recorrer_arraylist_con_for;
import java.util.ArrayList;
public class mostrar_numeros_mayores_a_10 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(12);
        numeros.add(8);
        numeros.add(20);
        numeros.add(15);
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > 10) {
                System.out.println(numeros.get(i));
            }
        }
    }
}