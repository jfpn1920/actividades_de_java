package foreach_enhanced_for;
public class recorrer_arreglo_con_foreach {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}