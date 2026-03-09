package recorrer_arrays_con_for;
public class recorrer_arreglo_inverso {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}