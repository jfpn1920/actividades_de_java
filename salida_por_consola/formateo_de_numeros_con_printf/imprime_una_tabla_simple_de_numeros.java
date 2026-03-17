package formateo_de_numeros_con_printf;
public class imprime_una_tabla_simple_de_numeros {
    public static void main(String[] args) {
        System.out.printf("%-10s %-10s %-10s%n", "numero", "doble", "triple");
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%-10d %-10d %-10d%n", i, i * 2, i * 3);
        }
    }
}