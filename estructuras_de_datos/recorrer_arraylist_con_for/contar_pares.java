package recorrer_arraylist_con_for;
import java.util.ArrayList;
public class contar_pares {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(4);
        numeros.add(7);
        numeros.add(10);
        numeros.add(12);
        int contador = 0;
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 == 0) {
                contador++;
            }
        }
        System.out.println("cantidad de numeros pares: " + contador);
    }

}