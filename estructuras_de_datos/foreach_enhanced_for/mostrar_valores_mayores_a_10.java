package foreach_enhanced_for;
public class mostrar_valores_mayores_a_10 {
    public static void main(String[] args) {
        int[] numeros = {5, 12, 8, 20, 3, 15};
        for (int numero : numeros) {
            if (numero > 10) {
                System.out.println(numero);
            }
        }
    }
}