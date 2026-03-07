package el_uso_del_break;
public class buscar_multiplo_especifico {
    public static void main(String[] args) {
        int multiplo = 7;
        System.out.println("buscando el primer multiplo de " + multiplo + " entre 1 y 100...");
        for (int i = 1; i <= 100; i++) {
            if (i % multiplo == 0) {
                System.out.println("el primer multiplo encontrado es: " + i);
                break; 
            }
        }
    }
}