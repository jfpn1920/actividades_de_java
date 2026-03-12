package metodos_con_return;
public class metodo_que_retorne_si_un_numero_es_par_boolean {
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
    public static void main(String[] args) {
        boolean resultado1 = esPar(10);
        boolean resultado2 = esPar(7);
        System.out.println("10 es par? " + resultado1);
        System.out.println("7 es par? " + resultado2);
    }
}