package recorrer_arrays_con_for;
public class mostrar_solo_impares {
    public static void main(String[] args) {
        int[] numeros = {10, 15, 20, 25, 30, 33, 40};
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println(numeros[i]);
            }
        }
    }
}