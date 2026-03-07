package uso_del_continue;
public class mostrar_numeros_excepto_multiplos_de_3 {
    public static void main(String[] args) {
        System.out.println("numeros del 1 al 20 excepto multiplos de 3:");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue; 
            }
            System.out.println(i);
        }
    }
}