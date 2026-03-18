package conversion_de_tipos_casting;
public class observa_la_perdida_de_decimales {
    public static void main(String[] args) {
        double numeroDecimal = 8.99;
        int numeroEntero = (int) numeroDecimal;
        System.out.println("numero original (double): " + numeroDecimal);
        System.out.println("numero convertido (int): " + numeroEntero);
    }
}