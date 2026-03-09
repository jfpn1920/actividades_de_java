package recorrer_arrays_con_for;
public class crear_patron_usando_arreglo {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}