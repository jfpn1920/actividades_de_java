package conversion_de_tipos_casting;
public class analiza_el_resultado_final {
    public static void main(String[] args) {
        double valorInicial = 19.99;
        int valorEntero = (int) valorInicial;
        double valorFinal = valorEntero;
        System.out.println("valor inicial (double): " + valorInicial);
        System.out.println("despues de convertir a int: " + valorEntero);
        System.out.println("convertido nuevamente a double: " + valorFinal);
    }
}