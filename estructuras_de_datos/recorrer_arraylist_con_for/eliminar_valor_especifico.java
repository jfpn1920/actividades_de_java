package recorrer_arraylist_con_for;
import java.util.ArrayList;
public class eliminar_valor_especifico {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        int valorEliminar = 15;
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == valorEliminar) {
                numeros.remove(i);
                break;
            }
        }
        System.out.println("lista despues de eliminar: " + numeros);
    }
}