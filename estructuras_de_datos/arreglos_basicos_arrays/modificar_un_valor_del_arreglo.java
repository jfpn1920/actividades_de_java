package arreglos_basicos_arrays;
public class modificar_un_valor_del_arreglo {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        numeros[2] = 100;
        System.out.println("valores del arreglo despues de la modificacion:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}