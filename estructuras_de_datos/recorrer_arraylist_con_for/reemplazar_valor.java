package recorrer_arraylist_con_for;
import java.util.ArrayList;
public class reemplazar_valor {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        int valorBuscar = 10;
        int nuevoValor = 100;
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == valorBuscar) {
                numeros.set(i, nuevoValor);
                break;
            }
        }
        System.out.println("lista despues de reemplazar: " + numeros);
    }
}