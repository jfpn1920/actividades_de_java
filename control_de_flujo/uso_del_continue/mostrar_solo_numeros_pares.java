package uso_del_continue;
public class mostrar_solo_numeros_pares {
    public static void main(String[] args) {
        System.out.println("numeros pares del 1 al 20:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}