package uso_del_continue;
public class saltar_numero_especifico {
    public static void main(String[] args) {
        System.out.println("numeros del 1 al 10 excepto el 5:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; 
            }
            System.out.println(i);
        }
    }
}