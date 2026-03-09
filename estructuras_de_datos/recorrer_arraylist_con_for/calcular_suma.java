package recorrer_arraylist_con_for;
import java.util.ArrayList;
public class calcular_suma {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        int suma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            suma += numeros.get(i);
        }
        System.out.println("la suma de los numeros es: " + suma);
    }
}