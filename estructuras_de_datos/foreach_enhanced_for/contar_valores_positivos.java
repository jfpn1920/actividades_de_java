package foreach_enhanced_for;
public class contar_valores_positivos {
    public static void main(String[] args) {
        int[] numeros = {-3, 7, 0, 12, -5, 8, 4};
        int contador = 0;
        for (int numero : numeros) {
            if (numero > 0) {
                contador++;
            }
        }
        System.out.println("cantidad de valores positivos: " + contador);
    }
}