package foreach_enhanced_for;
public class mini_ejercicio_comparativo {
    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 8, 10};
        System.out.println("recorrido con for:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("recorrido con foreach:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}