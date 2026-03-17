package formateo_de_numeros_con_printf;
public class imprime_valores_alineados {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 200;
        int num3 = 5;
        System.out.printf("%5d%n", num1);
        System.out.printf("%5d%n", num2);
        System.out.printf("%5d%n", num3);
    }
}