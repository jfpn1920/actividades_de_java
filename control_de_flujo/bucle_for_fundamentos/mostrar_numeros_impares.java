package bucle_for_fundamentos;
public class mostrar_numeros_impares {
    public static void main(String[] args) {
        System.out.println("numeros impares del 1 al 50:");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}