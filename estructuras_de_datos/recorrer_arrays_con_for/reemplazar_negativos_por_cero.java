package recorrer_arrays_con_for;
public class reemplazar_negativos_por_cero {
    public static void main(String[] args) {
        int[] numeros = {10, -5, 20, -8, 30};
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                numeros[i] = 0;
            }
        }
        System.out.println("arreglo después de reemplazar negativos:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}