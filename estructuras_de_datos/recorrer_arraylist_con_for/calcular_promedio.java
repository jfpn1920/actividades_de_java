package recorrer_arraylist_con_for;
import java.util.ArrayList;
public class calcular_promedio {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        int suma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            suma += numeros.get(i);
        }
        double promedio = (double) suma / numeros.size();
        System.out.println("el promedio es: " + promedio);
    }
}