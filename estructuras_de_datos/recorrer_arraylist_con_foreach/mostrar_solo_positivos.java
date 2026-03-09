package recorrer_arraylist_con_foreach;
import java.util.ArrayList;
public class mostrar_solo_positivos {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(-5);
        numeros.add(10);
        numeros.add(-3);
        numeros.add(20);
        numeros.add(7);
        for (Integer numero : numeros) {
            if (numero > 0) {
                System.out.println(numero);
            }
        }
    }
}