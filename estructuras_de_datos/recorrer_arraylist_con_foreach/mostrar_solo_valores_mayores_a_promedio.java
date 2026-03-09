package recorrer_arraylist_con_foreach;
import java.util.ArrayList;
public class mostrar_solo_valores_mayores_a_promedio {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        int suma = 0;
        for (Integer numero : numeros) {
            suma += numero;
        }
        double promedio = (double) suma / numeros.size();
        System.out.println("promedio: " + promedio);
        System.out.println("valores mayores al promedio:");
        for (Integer numero : numeros) {
            if (numero > promedio) {
                System.out.println(numero);
            }
        }
    }
}