package operadores_logicos;
public class imprime_resultados_logicos_en_consola {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("a > b && b < 10: " + (a > b && b < 10));
        System.out.println("a < b || b < 10: " + (a < b || b < 10));
        System.out.println("!(a > b): " + !(a > b));
    }
}