package recorrer_arraylist_con_for;
import java.util.ArrayList;
public class buscar_valor {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        int valorBuscado = 15;
        boolean encontrado = false;
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == valorBuscado) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("el valor " + valorBuscado + " esta en la lista.");
        } else {
            System.out.println("el valor no se encuentra en la lista.");
        }
    }
}