package foreach_enhanced_for;
public class mostrar_solo_valores_pares {
    public static void main(String[] args) {
        int[] numeros = {3, 8, 11, 14, 7, 20, 5};
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }
}