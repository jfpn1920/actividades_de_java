package conversion_de_tipos_casting;
public class imprime_el_resultado_de_la_conversion {
    public static void main(String[] args) {
        double valorOriginal = 27.68;
        int valorConvertido = (int) valorOriginal;
        System.out.println("valor original (double): " + valorOriginal);
        System.out.println("valor convertido (int): " + valorConvertido);
    }
}